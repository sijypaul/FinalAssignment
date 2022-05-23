package com.example.EmployeeManagementSystemSpringbootProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Column(name = "first_name", nullable = false)
    private String firstName;
	
	@Column(name = "last_name", nullable = false)
    private String lastName;
	
	
	
	@Column(name = "designation", nullable = false)
    private String designation;
	
	@Column(name ="salary", nullable = false)
    private long salary;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
    }

    
    public long getId() {
        return id;
    }
    public void setId(long id) {
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

    
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Designation=" + designation
				+ ", salary=" + salary + "]";
	}
    
    
}
