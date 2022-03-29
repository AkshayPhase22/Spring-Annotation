package com.demo.Spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;

public class Address {

	String city;
    

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Address class init method");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Address class init method");
	}
	

}
