package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employee_id;
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_fname() {
		return employee_fname;
	}
	public void setEmployee_fname(String employee_fname) {
		this.employee_fname = employee_fname;
	}
	public String getEmployee_lname() {
		return employee_lname;
	}
	public void setEmployee_lname(String employee_lname) {
		this.employee_lname = employee_lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	private String employee_fname;
	private String employee_lname;
	private String email;
	private String pass;
	private String city;
	private String gender;

}
