package com.PnPbackEnd.crud.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Courier {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int courierID;
	
	@Column(name="courierName")
	private String courierName;
	
	@Column(name="courierAddress")
	private String courierAddress;
	
	@Column(name="courierPhoneNumber")
	private int courierPhoneNumber;

	public int getCourierID() {
		return courierID;
	}

	public void setCourierID(int courierID) {
		this.courierID = courierID;
	}

	public String getCourierName() {
		return courierName;
	}

	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public String getCourierAddress() {
		return courierAddress;
	}

	public void setCourierAddress(String courierAddress) {
		this.courierAddress = courierAddress;
	}

	public int getCourierPhoneNumber() {
		return courierPhoneNumber;
	}

	public void setCourierPhoneNumber(int courierPhoneNumber) {
		this.courierPhoneNumber = courierPhoneNumber;
	}

	@Override
	public String toString() {
		return "Courier [courierID=" + courierID + ", courierName=" + courierName + ", courierAddress=" + courierAddress
				+ ", courierPhoneNumber=" + courierPhoneNumber + "]";
	}
	
}
