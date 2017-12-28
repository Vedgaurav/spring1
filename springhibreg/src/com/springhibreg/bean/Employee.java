package com.springhibreg.bean;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="emp1")
public class Employee implements Serializable {
	
	@Id
	private int id;
	
	private String firstName,lastName;

	public Employee()
	{
		super();
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
	
	

}
