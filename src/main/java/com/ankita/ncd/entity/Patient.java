package com.ankita.ncd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient_info")
public class Patient
{
	
	@Override
	public String toString() {
		return "Patient [patient_id=" + patient_id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender="
				+ gender + ", phone=" + phone + ", birthday=" + birthday + ", pincode="
				+ pincode + ", score=" + score + ", screening=" + screening + "]";
	}
	
	public Patient() 
	{
		super();

	}
	
	public Patient(long patient_id, String firstname, String lastname, String gender, String phone,
			String birthday, int pincode, int score, String screening) 
	{
		super();
		this.patient_id = patient_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		//this.aadhaar = aadhaar;
		this.phone = phone;
		this.birthday = birthday;
		this.pincode = pincode;
		this.score = score;
		this.screening = screening;
	}



	@Id
	@Column(name="patient_id",nullable = false )
	private long patient_id = (long) (Math.random() * (99999999999999L - 10000000000000L + 1) + 10000000000000L);
	
	@Column(name="first_name",nullable = true)
	private String firstname;
	
	@Column(name="last_name",nullable = true)
	private String lastname;
	
	@Column(name="gender",nullable = true)
	private String gender;
	
	/*@Column(name="aadhaar_uid",nullable = true)
	private String aadhaar;*/
	
	@Column(name="phone_no",nullable = true)
	private String phone;
	
	@Column(name="dob",nullable = true)
	private String birthday;
	
	@Column(name="pincode",nullable = true)
	private int pincode;
	
	@Column(name="score",nullable = true)
	private int score;
	
	@Column(name="screening",nullable = true)
	private String screening;
	
	public long getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(long patient_id) {
		this.patient_id = patient_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	/*public String getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}*/
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getScreening() {
		return screening;
	}
	public void setScreening(String screening) {
		this.screening = screening;
	}
	
	
}
