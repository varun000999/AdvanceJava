package com.nagarro.hrdashboard.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nagarro.hrdashboard.funtionality.AddingDummyEmployees;
import com.nagarro.hrdashboard.funtionality.AddingRecord;
import com.nagarro.hrdashboard.funtionality.Functionality;
import com.nagarro.hrdashboard.funtionality.UpdatingRecord;
import com.nagarro.hrdashboard.model.Employee;

/**
 * This is the controller class for Employee Adding
 * 
 * @author varunrawat
 *
 */
@Controller
public class EmployeeAddingController {
	@GetMapping("addemployee")
	public String getLogin(@ModelAttribute("addemployee") final Employee emp) {
		System.out.println("In GetMapping add employee");
		return "addemployee";
	}
	@PostMapping("addemployee") 
	public String postMethod(@ModelAttribute("addemployee") final Employee user,final Model model) {
	  System.out.println("In PostMapping add employee");
	  if(user.getEmployee_code()<100) {
		  model.addAttribute("codeerrorMessage","Code must be of atleast 4 digits");
		  return "addemployee";
	  }
	  if(user.getEmployee_name().length()==0) {
		  model.addAttribute("nameerrorMessage","Name cannot be empty");
		  return "addemployee";
	  }
	  else if(user.getEmployee_name().length()>100) {
		  model.addAttribute("nameerrorMessage","Name cannot be more than 100 characters");
		  return "addemployee";
	  }
	  if(user.getLocation().length()==0) {
		  model.addAttribute("locationerrorMessage","Location cannot be empty");
		  return "addemployee";
	  }
	  else if(user.getLocation().length()>500) {
		  model.addAttribute("locationerrorMessage","Location cannot be more than 500 characters");
		  return "addemployee";
	  }
	  if(user.getEmail().length()==0) {
		  model.addAttribute("emailerrorMessage","Email cannot be empty");
		  return "addemployee";
	  }
	  else if(!Functionality.emailValidate(user.getEmail())) {
		  model.addAttribute("emailerrorMessage","Not valid email type");
		  return "addemployee";
	  }
	  AddingRecord.add(user);
	  final ArrayList<Employee> lst=AddingDummyEmployees.giveemployees();
	  model.addAttribute("employee_list",lst);
	  return "employeelisting" ;	  //return "employeelisting";
	}
}