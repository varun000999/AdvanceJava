package com.nagarro.hrdashboard.funtionality;

import java.util.ArrayList;

import com.nagarro.hrdashboard.model.Employee;

/**
 * This is the dummy class to add some employee data
 * 
 * @author varunrawat
 *
 */
public class AddingDummyEmployees {
	public static ArrayList<Employee> lst=new ArrayList<>();
	public static void fixemployeevalues() {
		if(lst.size()>0) {
			return;
		}
		final Employee emp1=new Employee();
		final Employee emp2=new Employee();
		final Employee emp3=new Employee();
		emp1.setEmployee_code(500);
		emp1.setEmployee_name("Rajesh Kumar");
		emp1.setLocation("Gurugaon");
		emp1.setEmail("rajesh.k@company.com");
		emp1.setDate_of_birth("01-01-2023");
		emp2.setEmployee_code(501);
		emp2.setEmployee_name("Avnish Sir");
		emp2.setLocation("Delhi");
		emp2.setEmail("mentor@nagarro.com");
		emp2.setDate_of_birth("01-01-2000");
		emp3.setEmployee_code(502);
		emp3.setEmployee_name("Parul Parmar");
		emp3.setLocation("India");
		emp3.setEmail("hr@nagarro.com");
		emp3.setDate_of_birth("01-01-1990");
		lst.add(emp1);
		lst.add(emp2);
		lst.add(emp3);
		System.out.println(emp1);
		System.out.println(emp1);
		System.out.println(emp1);
	}
	public static  ArrayList<Employee> giveemployees(){
		return lst;
	}
	public static Employee getEmployee(final String id) {
		final int emp_code=Integer.parseInt(id);
		for(final Employee em:lst) {
			if(em.getEmployee_code()==emp_code) {
				return em;
			}
		}
		System.out.println("match ni hua bro");
		return new Employee();
	}
	public static String hashcodeofstring(final String id) {
		int i=0;
		while(i<id.length()) {
			if(id.charAt(i)=='@')
				break;
			i++;
		}
		return id.substring(i+1);
	}
	public void addemployee() {
		// make employee with input detaisl and add it to the lst.
	}
}
