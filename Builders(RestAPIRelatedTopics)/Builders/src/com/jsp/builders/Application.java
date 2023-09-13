package com.jsp.builders;

import static com.jsp.builders.service.StaticScannerAndPrint.*;

public class Application 
{
	public static void main(String[] args) 
	{
		EmployeeBulider employeeBulider1 = new EmployeeBulider();
		employeeBulider1.setId(20);
		employeeBulider1.setName("Litish");
		employeeBulider1.setSalary(56000);
		println(employeeBulider1);
		Employee employee1 = employeeBulider1.build();
		println(employee1);
		println();
		EmployeeBulider employeeBulider2 = new EmployeeBulider();
		println(employeeBulider2);
		EmployeeBulider employeeBulider3 = employeeBulider2.setId(21);
		println(employeeBulider3);
		EmployeeBulider employeeBulider4 = employeeBulider3.setName("Chandu");
		println(employeeBulider4);
		EmployeeBulider employeeBulider5 = employeeBulider4.setSalary(50000);
		println(employeeBulider5);
		println();
		Employee employee2 = new EmployeeBulider().setId(22).setName("Prasad").setSalary(100000).build();
		println(employee2);
		Employee employee3 = Employee.builder().setId(23).setName("Aruna").setSalary(120000).build();
		println(employee3);
	}
}
