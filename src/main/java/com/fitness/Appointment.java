package com.fitness;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

enum PREFERENCE{
	MALE, FEMALE
}

enum PACKAGE{
	ONETIME, FOURSESSIONS, FIVESESSIONS
}

@Entity
@Table(name = "appointments")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	Integer id;
	
	String name;
	
	int age;
	String email;
	String mobileNumber;
	String address;
	String city;
	String State;
	String country;
	String pincode;
	PREFERENCE preference;
	boolean physiotherapist;
	PACKAGE type;
	int weeks;
	float amount;
	
	public Integer getId() {
		return id;
	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public PREFERENCE getPreference() {
		return preference;
	}
	public void setPreference(PREFERENCE preference) {
		this.preference = preference;
	}
	public boolean isPhysiotherapist() {
		return physiotherapist;
	}
	public void setPhysiotherapist(boolean physiotherapist) {
		this.physiotherapist = physiotherapist;
	}
	public PACKAGE getType() {
		return type;
	}
	public void setType(PACKAGE type) {
		this.type = type;
	}
	public int getWeeks() {
		return weeks;
	}
	public void setWeeks(int weeks) {
		this.weeks = weeks;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
}
