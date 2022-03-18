package com.example.demo.model;

public class Doctor {
	private int doctorId;
	private String docytoName;
	private long handPhone;
	private String email;
	private String specialiation;
	private String city ;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int doctorId, String docytoName, long handPhone, String email, String specialiation, String city) {
		super();
		this.doctorId = doctorId;
		this.docytoName = docytoName;
		this.handPhone = handPhone;
		this.email = email;
		this.specialiation = specialiation;
		this.city = city;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDocytoName() {
		return docytoName;
	}
	public void setDocytoName(String docytoName) {
		this.docytoName = docytoName;
	}
	public long getHandPhone() {
		return handPhone;
	}
	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getspecialiation() {
		return specialiation;
	}
	public void setspecialiation(String specialiation) {
		this.specialiation = specialiation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", docytoName=" + docytoName + ", handPhone=" + handPhone + ", email="
				+ email + ", specialiation=" + specialiation + ", city=" + city + "]";
	}
	
}

