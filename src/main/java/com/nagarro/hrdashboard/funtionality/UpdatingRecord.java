package com.nagarro.hrdashboard.funtionality;

import com.nagarro.hrdashboard.model.Employee;

/**
 * This is the Class for dealing wit updates
 * 
 * @author varunrawat
 *
 */
public class UpdatingRecord {
	public static void update(final String id,final Employee new_val) {
		final Employee curr_emp=AddingDummyEmployees.getEmployee(id);
		curr_emp.setEmployee_name(new_val.getEmployee_name());
		curr_emp.setEmail(new_val.getEmail());
		curr_emp.setLocation(new_val.getLocation());
		curr_emp.setDate_of_birth(new_val.getDate_of_birth());
	}

}
