package com.nagarro.hrdashboard.model;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
/**
 * This is the Model Class for Employee
 * 
 * @author varunrawat
 *
 */
public class Employee {
	int employee_code;
	String employee_name;
	String location;
	String email;
	String date_of_birth;
	
	public int getEmployee_code() {
		return employee_code;
	}
	public void setEmployee_code(final int employee_code) {
		this.employee_code = employee_code;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(final String employee_name) {
		this.employee_name = employee_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(final String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(final String email) {
		this.email = email;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(final String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

}
