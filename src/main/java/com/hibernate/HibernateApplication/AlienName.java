package com.hibernate.HibernateApplication;

import javax.persistence.Embeddable;

@Embeddable
public class AlienName {
	private String fname;
	private String lname;
	private String mname;
	
	public AlienName() {
		
	}
	public AlienName(String fname, String lname, String mname) {
		this.fname = fname;
		this.lname = lname;
		this.mname = mname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "AlienName [fname=" + fname + ", lname=" + lname + ", mname=" + mname + "]";
	}
	

}
