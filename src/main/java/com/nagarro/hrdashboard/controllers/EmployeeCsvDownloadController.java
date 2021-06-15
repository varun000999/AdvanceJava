package com.nagarro.hrdashboard.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nagarro.hrdashboard.funtionality.AddingDummyEmployees;
import com.nagarro.hrdashboard.funtionality.Downloading;
import com.nagarro.hrdashboard.model.Employee;

/**
 * This is the controller class for Downloading Employees as CSV File
 * 
 * @author varunrawat
 *
 */

@Controller
public class EmployeeCsvDownloadController {
	@RequestMapping("downloadcsv")
	public void downloadCsvFile(HttpServletResponse response) throws Exception{
		System.out.println("In GetMapping download csv");// yha ake gadi atki
		String filename="employee.csv";
		response.setContentType("text/csv");
		response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + filename + "\"");
		Downloading.saving(response.getWriter(),AddingDummyEmployees.lst);
	}

}
