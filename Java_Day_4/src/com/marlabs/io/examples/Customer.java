package com.marlabs.io.examples;

import java.io.Serializable;

/*
 *  1) Serializable Interface
 *  2) Cloneable Interface
 *  // Marker or Tagged Interface
 */
@SuppressWarnings("serial")
public final class Customer implements Serializable {
	private String customerId;
	private String customerName;
	private transient String customerPassWord;
	private long customerPinCode;
	private String customerCity;

	/**
	 * @param customerId
	 * @param customerName
	 * @param customerPassWord
	 * @param customerPinCode
	 * @param customerCity
	 */
	public Customer(String customerId, String customerName,
			String customerPassWord, long customerPinCode, String customerCity) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassWord = customerPassWord;
		this.customerPinCode = customerPinCode;
		this.customerCity = customerCity;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @return the customerPassWord
	 */
	public String getCustomerPassWord() {
		return customerPassWord;
	}

	/**
	 * @return the customerPinCode
	 */
	public long getCustomerPinCode() {
		return customerPinCode;
	}

	/**
	 * @return the customerCity
	 */
	public String getCustomerCity() {
		return customerCity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName="
				+ customerName + ", customerPassWord=" + customerPassWord
				+ ", customerPinCode=" + customerPinCode + ", customerCity="
				+ customerCity + "]";
	}
}
