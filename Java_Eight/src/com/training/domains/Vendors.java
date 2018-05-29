package com.training.domains;

import java.util.List;

public class Vendors {

	private long vendorId;
	private List<String> services;
	public Vendors(long vendorId, List<String> services) {
		super();
		this.vendorId = vendorId;
		this.services = services;
	}
	public Vendors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getVendorId() {
		return vendorId;
	}
	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
	}
	public List<String> getServices() {
		return services;
	}
	public void setServices(List<String> services) {
		this.services = services;
	}
	@Override
	public String toString() {
		return "Vendors [vendorId=" + vendorId + ", services=" + services + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((services == null) ? 0 : services.hashCode());
		result = prime * result + (int) (vendorId ^ (vendorId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendors other = (Vendors) obj;
		if (services == null) {
			if (other.services != null)
				return false;
		} else if (!services.equals(other.services))
			return false;
		if (vendorId != other.vendorId)
			return false;
		return true;
	}
	
	
}
