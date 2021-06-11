package com.nagarro.hrdashboard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nagarro.hrdashboard.funtionality.AddingDummyEmployees;
import com.nagarro.hrdashboard.funtionality.Functionality;
import com.nagarro.hrdashboard.funtionality.UpdatingRecord;
import com.nagarro.hrdashboard.model.Employee;

/**
 * This is the controller class for Employee Editing
 * 
 * @author varunrawat
 *
 */
@Controller
public class EmployeeEditingController {
	@GetMapping("employeedetails/{id}")
	public String getLogin(@ModelAttribute("employeedetails") final Employee emp,final Model model,@PathVariable final String id) {
		System.out.println("In GetMapping edit employee");
		final Employee curr_emp=AddingDummyEmployees.getEmployee(id);
		model.addAttribute("employee",curr_emp);
		System.out.println(curr_emp.getEmployee_code());
		System.out.println(curr_emp.getEmployee_name());
		return "employeedetails";
	}
	@PostMapping("employeedetails/{id}") 
	public String postMethod(@ModelAttribute("employeedetails") final Employee user,final Model model,@PathVariable final String id ) {
	  System.out.println("In PostMapping edit employee");
	  if(user.getEmployee_name().length()==0) {
		  model.addAttribute("nameerrorMessage","Name cannot be empty");
		  return "employeedetails";
	  }
	  else if(user.getEmployee_name().length()>100) {
		  model.addAttribute("nameerrorMessage","Name cannot be more than 100 characters");
		  return "employeedetails";
	  }
	  if(user.getLocation().length()==0) {
		  model.addAttribute("locationerrorMessage","Location cannot be empty");
		  return "employeedetails";
	  }
	  else if(user.getLocation().length()>500) {
		  model.addAttribute("locationerrorMessage","Location cannot be more than 500 characters");
		  return "employeedetails";
	  }
	  if(user.getEmail().length()==0) {
		  model.addAttribute("emailerrorMessage","Email cannot be empty");
		  return "employeedetails";
	  }
	  else if(!Functionality.emailValidate(user.getEmail())) {
		  model.addAttribute("emailerrorMessage","Not valid email type");
		  return "employeedetails";
	  }
	  UpdatingRecord.update(id,user);
	  return "employeelisting";
	}
}