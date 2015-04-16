package cn.edu.shou.hsh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.shou.hsh.core.AppContextUtil;
import cn.edu.shou.hsh.model.Employee;
import cn.edu.shou.hsh.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	public EmployeeController(){
		System.out.println("no params constructor:"+employeeService);
	}
	
	{
		System.out.println("module:"+employeeService);
	}
	
	public List<Employee> getEmployeeList(){
		System.out.println("getEmployeeList...");
		System.out.println(employeeService);
		List<Employee> employeeList = employeeService.getEmployee();
		return employeeList;
	}
	
	@RequestMapping("/employee")
	public String getEmployee(Model model){
		System.out.println("start...."+AppContextUtil.getApplicationContext().getBean("employeeService"));
		List<Employee> employeeList = getEmployeeList();
		for(Employee employee : employeeList){
			System.out.println("ÐÕÃû£º"+employee.getName());
		}
		System.out.println("end....");
		return "index";
	}
	
	
}
