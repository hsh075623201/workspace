package cn.edu.shou.hsh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.shou.hsh.dao.EmployeeDao;
import cn.edu.shou.hsh.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	
	public EmployeeService(){
		System.out.println("EmployeeService Constructor:"+employeeDao);
	}
	
	{
		System.out.println("EmployeeService module:"+employeeDao);
	}
	public List<Employee> getEmployee(){
		System.out.println("sdfsd"+employeeDao);
		return employeeDao.getEmployee();
	}
	
	public void JunitTest(){
		System.out.println("Test...");
	}
}
