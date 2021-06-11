package com.nagarro.hrdashboard.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.nagarro.hrdashboard.funtionality.AddingDummyEmployees;
import com.nagarro.hrdashboard.model.Employee;
import com.nagarro.hrdashboard.model.HR;
/**
 * This is the controller class for Login.jsp
 * 
 * @author varunrawat
 *
 */

@Controller
@SessionAttributes("loged_in_user")
public class LoginController {

	@GetMapping("login")
	public String getLogin(@ModelAttribute("login") final HR user) {
		System.out.println("In login getlogin");
		return "login";
	}
	@PostMapping("login")
	public String doLogin(@Valid @ModelAttribute("login") final HR user,final Model model) {
		System.out.println("In login postlogin");
		System.out.println("Welcome : "+ user.getName());
		if(user.getName().equals("")) {
			model.addAttribute("userNameErrorMessage","User Name can't be empty");
			return "login";
		}
		else if(user.getName().length()<5||user.getName().length()>50) {
			model.addAttribute("userNameErrorMessage","Allowed size of Name is between 5 and 50");
			return "login";
		}
		if(user.getPassword().equals("")) {
			model.addAttribute("passwordErrorMessage","Password can't be empty");
			return "login";
		}
		else if(user.getPassword().length()<5||user.getPassword().length()>50) {
			model.addAttribute("passwordErrorMessage","Allowed size of Password between 5 and 50");
			return "login";
		}
		if(!user.getName().equals("simple")||!user.getPassword().equals("dimple")) {
			model.addAttribute("invalidCredentialMessage","Invalid Login Credentials");
			return "login";
		}
		AddingDummyEmployees.fixemployeevalues(); 
		model.addAttribute("loged_in_user",user.getName());
		final ArrayList<Employee> lst=AddingDummyEmployees.giveemployees();
		System.out.println(lst.size());
		model.addAttribute("employee_list",lst);
		return "employeelisting";
	}
}
