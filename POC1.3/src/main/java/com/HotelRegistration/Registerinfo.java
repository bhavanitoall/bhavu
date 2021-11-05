package com.HotelRegistration;

public class Registerinfo {
	private String Fname,Lname,Uname,Pass,Dob,Phone;


	public Registerinfo() {
		super();
	}




	public Registerinfo(String Fname,String Lname,String Uname, String Pass, String Dob, String Phone) {
		super();
		this.Fname = Fname;
		this.Lname = Lname;
		this.Uname = Uname;
		this.Pass = Pass;
		this.Dob = Dob;
		this.Phone = Phone;
	}




	public String getFname() {
		return Fname;
	}




	public void setFname(String Fname) {
		this.Fname = Fname;
	}




	public String getLname() {
		return Lname;
	}




	public void setLname(String Lname) {
		this.Lname = Lname;
	}




	public String getUname() {
		return Uname;
	}




	public void setUname(String Uname) {
		this.Uname = Uname;
	}




	public String getPass() {
		return Pass;
	}




	public void setPass(String Pass) {
		this.Pass = Pass;
	}




	public String getDob() {
		return Dob;
	}




	public void setDob(String Dob) {
		this.Dob = Dob;
	}




	public String getPhone() {
		return Phone;
	}




	public void setPhone(String Phone) {
		this.Phone = Phone;
	}


}
