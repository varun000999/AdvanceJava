package com.nagarro.hrdashboard.funtionality;

import java.io.PrintWriter;
import java.util.ArrayList;

import com.nagarro.hrdashboard.model.Employee;

/**
 * This is the Supporter class for Downloading CSV files
 * 
 * @author varunrawat
 *
 */
public class Downloading {
	public static void saving(PrintWriter writer, ArrayList<Employee> lst) {
		writer.write("Employee Code, Employee Name, Employee Location, Employee Email, Employee DOB \n");
		for(Employee emp:lst) {
			writer.write(emp.getEmployee_code()+","+emp.getEmployee_name()+","+emp.getLocation()+","+emp.getEmail()+","+emp.getDate_of_birth()+"\n");
		}
	}

}
