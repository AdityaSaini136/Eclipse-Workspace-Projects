package com.epam;

public class Employee {

	int id;
	String empname;
	String compname;
	double salary;
	public Employee() {

	}
	public Employee(String empname, String compname,double salary) {
		super();
		this.empname = empname;
		this.compname = compname;
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getCompname() {
		return compname;
	}
	public void setCompname(String compname) {
		this.compname = compname;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + ", compname=" + compname + ", salary=" + salary + "]";
	}

}
