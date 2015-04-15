package cn.edu.shou.hsh.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.shou.hsh.model.Employee;

@Repository
@Transactional(rollbackFor=Exception.class) 
public interface EmployeeDao {
	//��ȡ
	public List<Employee> getEmployee();
	
}
