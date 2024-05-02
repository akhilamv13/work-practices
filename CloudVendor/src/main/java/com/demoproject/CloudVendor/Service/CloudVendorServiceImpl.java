package com.demoproject.CloudVendor.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demoproject.CloudVendor.Entity.CloudVendor;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {
	
	CloudVendor cloudVendor=new CloudVendor();
	List<CloudVendor> cloudVendors=new ArrayList<>();
	
	public List<CloudVendor> getCloudVendors(){
		return cloudVendors;
	}
	
	public Optional<CloudVendor> getCloudVendorById(String VendorId) {
		Optional<CloudVendor> cloudvendor=cloudVendors.stream().filter(cloudvendor1 -> cloudvendor1.getVendorId().equalsIgnoreCase(VendorId)).findFirst();
		return cloudvendor;
	}
	
	public String postCloudVendor(CloudVendor cloudVendor) {
		this.cloudVendor=cloudVendor;
		cloudVendors.add(cloudVendor);
		return "Successfully Inserted Vendor data";
	}
	
	public String putCloudVendor(String vendorId, CloudVendor cloudVendor) {
		String msg=null;
		Optional<CloudVendor> cloudvendor= cloudVendors.stream().filter(cloudvendor1 -> cloudvendor1.getVendorId().equalsIgnoreCase(vendorId)).findFirst();
		if(cloudvendor.isEmpty()) {
			msg="Vendor with giver Id not exist";
		}else {
			cloudvendor.get().setVendorId(cloudVendor.getVendorId());
			cloudvendor.get().setVendorAddress(cloudVendor.getVendorAddress());
			cloudvendor.get().setVendorName(cloudVendor.getVendorName());
			cloudvendor.get().setVendorPhone(cloudVendor.getVendorPhone());
			msg="Vendor updated successfully";
		}
		return msg;
	}
	
	public String deleteCloudVendor(String VendorId) {
		int length=cloudVendors.size();
		String msg=null;
		cloudVendors.removeIf(cloudVendor -> cloudVendor.getVendorId().equalsIgnoreCase(VendorId));
		if(length==cloudVendors.size()) {
			msg="Vendor with giver Id not exist";
		}else {
			msg="Vendor deleted successfully";
		}
		return msg;
	}
}
