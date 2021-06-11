package com.nagarro.hrdashboard.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nagarro.hrdashboard.funtionality.AddingDummyEmployees;
import com.nagarro.hrdashboard.model.Employee;

/**
 * This is the controller class for EployeeListing
 * 
 * @author varunrawat
 *
 */
@Controller
public class EmployeeListingController {
	@GetMapping("employeelisting")
	public String getlogin(@ModelAttribute("employeelisting") final Employee user,final Model model) {
		System.out.println("In login getemployeelisting");
		final ArrayList<Employee> lst=AddingDummyEmployees.giveemployees();
		System.out.println(lst.size());
		model.addAttribute("employee_list",lst);
		return "employeelisting";
	}
}
