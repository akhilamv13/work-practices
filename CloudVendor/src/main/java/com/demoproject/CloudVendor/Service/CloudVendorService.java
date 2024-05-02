package com.demoproject.CloudVendor.Service;

import java.util.List;
import java.util.Optional;

import com.demoproject.CloudVendor.Entity.CloudVendor;

public interface CloudVendorService {
	public List<CloudVendor> getCloudVendors();
	public Optional<CloudVendor> getCloudVendorById(String VendorId);
	public String postCloudVendor(CloudVendor cloudVendor);
	public String putCloudVendor(String vendorId, CloudVendor cloudVendor) ;
	public String deleteCloudVendor(String VendorId) ;
}
