package com.jsp.builders;

//To Simplifies Creation of Employee Object
public class EmployeeBulider 
{
	private int id;
	private String name;
	private double salary;
	//To Initialize all the Variables
	public int getId() 
	{
		return id;
	}
	public EmployeeBulider setId(int id) 
	{
		this.id = id;
		return this;
	}
	public String getName() 
	{
		return name;
	}
	public EmployeeBulider setName(String name) 
	{
		this.name = name;
		return this;
	}
	public double getSalary() 
	{
		return salary;
	}
	public EmployeeBulider setSalary(double salary) 
	{
		this.salary = salary;
		return this;
	}
	@Override
	public String toString() 
	{
		return "EmployeeBulider [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee build()
	{
		return new Employee(id, name, salary);
	}
}
