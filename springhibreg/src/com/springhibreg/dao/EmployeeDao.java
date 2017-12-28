package com.springhibreg.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springhibreg.bean.Employee;

public class EmployeeDao {
	
	private HibernateTemplate template;
	
	public void saveEmployee(Employee e)
	{
		template.save(e);
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public void updateEmployee(Employee e)
	{
		template.update(e);
	}
	
	public void deleteEmployee(Employee e)
	{
		template.delete(e);
	}
	
	public Employee getById(int id)
	{
		Employee e= (Employee)template.get(Employee.class, id);
		return e;
	}
	
	public List<Employee> getAllEmployees()
	{
		List<Employee> list=new ArrayList<Employee>();
		list=template.loadAll(Employee.class);
		return list;
	}
}
