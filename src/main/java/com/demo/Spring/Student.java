package com.demo.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	int stdId;
	String stdName;
	Address address;

	@Autowired
	public Student(@Qualifier("address22") Address address) {
		super();
		this.address = address;
	}

	public Student() {
		super();
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getStdId() {
		return stdId;
	}

	@Required
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	@Required
	public void setStdName(String stdName) {
		this.stdName = stdName;

	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", address=" + address + "]";
	}
}
