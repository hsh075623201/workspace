package cn.edu.shou.hsh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.shou.hsh.model.Employee;
import cn.edu.shou.hsh.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employee")
	public String getEmployee(Model model){
		System.out.println("start....");
		List<Employee> employeeList = employeeService.getEmployee();
		for(Employee employee : employeeList){
			System.out.println("������"+employee.getName());
		}
		System.out.println("end....");
		return "index";
	}
}
