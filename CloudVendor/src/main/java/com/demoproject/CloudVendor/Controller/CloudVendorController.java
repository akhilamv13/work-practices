package com.demoproject.CloudVendor.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoproject.CloudVendor.Entity.CloudVendor;
import com.demoproject.CloudVendor.Service.CloudVendorService;

@RestController
public class CloudVendorController {
	@Autowired
	public CloudVendorService cloudVendorService;
	
	@GetMapping("/cloudVendor")
	public List<CloudVendor> getCloudVendors() {
		return cloudVendorService.getCloudVendors();
	}
	
	@GetMapping("/cloudVendor/{vendorId}")
	public Optional<CloudVendor> getCloudVendorById(@PathVariable String VendorId) {
		return cloudVendorService.getCloudVendorById(VendorId);
	}
	
	@PostMapping("/cloudVendor")
	public String postCloudVendor(@RequestBody CloudVendor cloudVendor) {
		return cloudVendorService.postCloudVendor(cloudVendor);
	}
	
	@PutMapping("/cloudVendor/{vendorId}")
	public String putCloudVendor(@PathVariable String vendorId,@RequestBody CloudVendor cloudVendor) {
		return cloudVendorService.putCloudVendor(vendorId,cloudVendor);
	}
	
	@DeleteMapping("/cloudVendor/{vendorId}")
	public String deleteCloudVendor(@PathVariable String VendorId) {
		return cloudVendorService.deleteCloudVendor(VendorId);
	}
}
