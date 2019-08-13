package com.model;

public class Employee {
	
	private int emp_id;
	private String first_name;
	private String last_name;
	private String dob;
	private String email;
	private String department_id;
	
	
	
	
	public Employee(int emp_id, String first_name, String last_name, String dob, String email, String department_id) {
		super();
		this.emp_id = emp_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.dob = dob;
		this.email = email;
		this.department_id = department_id;
	}
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}




	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	} 
   
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", first_name=" + first_name + ", last_name=" + last_name + ", dob=" + dob
				+ ", email=" + email + ", department_id=" + department_id + "]";
	}
}
