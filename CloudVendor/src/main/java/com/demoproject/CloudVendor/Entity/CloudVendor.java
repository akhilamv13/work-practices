package com.demoproject.CloudVendor.Entity;

import jakarta.persistence.Entity;

@Entity
public class CloudVendor {
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private String vendorPhone;
	
	public CloudVendor() {
		super();
	}
	
	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhone) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhone = vendorPhone;
	}
	
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public String getVendorPhone() {
		return vendorPhone;
	}
	public void setVendorPhone(String vendorPhone) {
		this.vendorPhone = vendorPhone;
	}
	
	
	
}
