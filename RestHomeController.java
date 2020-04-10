package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employees;
import com.example.demo.model.GenericResponse;
import com.example.demo.service.EmployeesService;

@Controller
@RestController
public class RestHomeController {
	
	@Autowired
	private EmployeesService employeesService;
	
    @RequestMapping(value="/employees")
	public ResponseEntity<GenericResponse>getAllEmployees(GenericResponse response)
	{
		try
		{
		
		response.setStatus(0);
		List<Employees>list=employeesService.getAllEmployees();
		if(list.size()>0)
		{
			response.setStatus(1);
			response.setData(list);
			response.setMessage("OK, accepted !!");
		}
		}
		catch(Throwable th)
		{
			th.printStackTrace();
			response.setError("Error, Employee not found !");
		}
		return new ResponseEntity<GenericResponse>(response,HttpStatus.OK);
	}
	
	

}
