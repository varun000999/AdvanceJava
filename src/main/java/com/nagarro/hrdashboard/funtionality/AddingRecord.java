package com.nagarro.hrdashboard.funtionality;

import com.nagarro.hrdashboard.model.Employee;

/**
 * This is the AddingRecord Class
 * 
 * @author varunrawat
 *
 */
public class AddingRecord {
	public static void add(final Employee new_val) {
		final Employee curr_emp=new_val;
		AddingDummyEmployees.lst.add(curr_emp);
	}
}
