package com.jsp.builders;

public class Employee 
{
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	//Inner Class
	static class EmployeeBuilder
	{
		private int id;
		private String name;
		private double salary;
		//To Initialize all the Variables
		public int getId() 
		{
			return id;
		}
		public EmployeeBuilder setId(int id) 
		{
			this.id = id;
			return this;
		}
		public String getName() 
		{
			return name;
		}
		public EmployeeBuilder setName(String name) 
		{
			this.name = name;
			return this;
		}
		public double getSalary() 
		{
			return salary;
		}
		public EmployeeBuilder setSalary(double salary) 
		{
			this.salary = salary;
			return this;
		}
		//To get Object of employee Class with Proper Data
		public Employee build()
		{
			return new Employee(id, name, salary);
		}
	}
	@Override
	public String toString() 
	{
		return "EmployeeBulider [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	//Object of Employee Builder Static Inner Class
	public static EmployeeBuilder builder()
	{
		return new EmployeeBuilder();
	}
}
