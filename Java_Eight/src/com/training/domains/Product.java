package com.training.domains;

public class Product {

	private long productNumber;
	private String productName;
	private double ratePerUnit;
	private boolean discount;
	
	public Product() {
		super();
	
	}

	

	
	public Product(long productNumber, String productName, double ratePerUnit) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (discount ? 1231 : 1237);
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + (int) (productNumber ^ (productNumber >>> 32));
		long temp;
		temp = Double.doubleToLongBits(ratePerUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Product other = (Product) obj;
		if (discount != other.discount)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productNumber != other.productNumber)
			return false;
		if (Double.doubleToLongBits(ratePerUnit) != Double.doubleToLongBits(other.ratePerUnit))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", ratePerUnit="
				+ ratePerUnit + ", discount=" + discount + "]";
	}

	public long getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(long productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}

	public boolean isDiscount() {
		return discount;
	}

	public void setDiscount(boolean discount) {
		this.discount = discount;
	}

	public Product(long productNumber, String productName, double ratePerUnit, boolean discount) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
		this.discount = discount;
	}
	
}
