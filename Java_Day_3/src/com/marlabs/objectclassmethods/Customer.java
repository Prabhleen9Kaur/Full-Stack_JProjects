package com.marlabs.objectclassmethods;

// Cloneable, Serializable etc Marker or Tagged Interfaces
// What's The Use?
// Is it Possible to Create Your Own Marker interface's?
public class Customer implements Cloneable {
	private int customerId;
	private String customerName;
	private String customerPassWord;
	private String customerCityName;

	/**
	 * @param customerId
	 * @param customerName
	 * @param customerPassWord
	 * @param customerCityName
	 */
	public Customer(int customerId, String customerName,
			String customerPassWord, String customerCityName) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassWord = customerPassWord;
		this.customerCityName = customerCityName;
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
				+ ", customerCityName=" + customerCityName + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		System.out.println("From hashCode Method");
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((customerCityName == null) ? 0 : customerCityName.hashCode());
		result = prime * result + customerId;
		result = prime * result
				+ ((customerName == null) ? 0 : customerName.hashCode());
		result = prime
				* result
				+ ((customerPassWord == null) ? 0 : customerPassWord.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		System.out.println("From equals Method");
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Customer)) {
			return false;
		}
		Customer other = (Customer) obj;
		if (customerCityName == null) {
			if (other.customerCityName != null) {
				return false;
			}
		} else if (!customerCityName.equals(other.customerCityName)) {
			return false;
		}
		if (customerId != other.customerId) {
			return false;
		}
		if (customerName == null) {
			if (other.customerName != null) {
				return false;
			}
		} else if (!customerName.equals(other.customerName)) {
			return false;
		}
		if (customerPassWord == null) {
			if (other.customerPassWord != null) {
				return false;
			}
		} else if (!customerPassWord.equals(other.customerPassWord)) {
			return false;
		}
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); // super at Method Level
	}

	@Override
	public void finalize() {
		System.out.println("From finalize Method");
	}
}
