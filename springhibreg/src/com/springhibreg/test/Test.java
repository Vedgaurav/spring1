package com.springhibreg.test;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springhibreg.bean.Employee;
import com.springhibreg.dao.EmployeeDao;

public class Test {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("applicationContext.xml");  
		
		EmployeeDao dao= (EmployeeDao)context.getBean("d");
		
		Employee e= new Employee();
		
		e.setId(120);
		e.setFirstName("Radhe");
		e.setLastName("Krishna");
		
	     //dao.saveEmployee(e);
		//dao.updateEmployee(e);
		//dao.deleteEmployee(e);
		
		//e=dao.getById(80);
		
		List<Employee> list= dao.getAllEmployees();
		
		for(Employee f:list)
		System.out.println(f.getId()+"\t"+f.getFirstName()+"\t"+f.getLastName());
		
	//	System.out.println("successfully inserted");
	}
}
