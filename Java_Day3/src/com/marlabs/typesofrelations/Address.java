package com.marlabs.typesofrelations;

public class Address {
	private int streetNumber;
	private String houseNumber;
	private String streetName;
	private long pinCode;
	private String cityName;

	/**
	 * @param streetNumber
	 * @param houseNumber
	 * @param streetName
	 * @param pinCode
	 * @param cityName
	 */
	public Address(int streetNumber, String houseNumber, String streetName,
			long pinCode, String cityName) {
		this.streetNumber = streetNumber;
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.pinCode = pinCode;
		this.cityName = cityName;
	}

	// If We want to Know the State Of An Object In String Representation
	@Override
	public String toString() {
		return "Address [streetNumber=" + streetNumber + ", houseNumber="
				+ houseNumber + ", streetName=" + streetName + ", pinCode="
				+ pinCode + ", cityName=" + cityName + "]";
	}
}
