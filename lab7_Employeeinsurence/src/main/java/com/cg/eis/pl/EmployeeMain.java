package com.cg.eis.pl;

import java.util.List;
import java.util.Scanner;
import com.cg.eis.beans.Employee;
import com.cg.eis.service.Services;
//import com.cg.eis.service.EmployeeService;




public class EmployeeMain {
	
	static Scanner sc = new Scanner(System.in);
	
	static Services esi = new Services();
	static Employee emp = new  Employee();
	
	public static void main(String[] args) {
		
		
		EmployeeMain obj = new EmployeeMain();
		
		while(true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Enter new  Employee"+"\n"+"2. Display All employees"+"\n"+"3. Search using Insurance Scheme"+"\n"+"0. Exit");
			int n = Integer.parseInt(sc.nextLine());
			switch(n) {
			case 1: 
				EmployeeMain.insertEmp();
				break;
			case 2:
				obj.displayEmployees();
				break;
			case 3:
				obj.employeeInsuranceScheme();
				break;
			case 4:
				obj.employeeID();
				break;
			case 0:
				System.exit(0);
				
			}
			
		}

	}
	
	public static void insertEmp() {
		System.out.print("Enter id:--");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter name:--");
		String name = sc.nextLine();
		System.out.print("Enter salary:--");
		int salary = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Designation:--");
		String designation = sc.nextLine();
		
		System.out.println("");
		esi.insertEmployee(new Employee(id, name, salary, designation, designation));
		
		
		
	}
	
	public void displayEmployees()
	{
		System.out.println("\n-------------- Employee's Information ----------------\n");
		List<Employee> empList = esi.getAllEmployees();
		
		iterateEmployeeList(empList);
		
			}
	
	public void displayEmployee(Employee e)
	{
		System.out.println("\n===================================================\n");
		System.out.println(" ID : "+e.getId());
		System.out.println(" Name : "+e.getName());
		System.out.println(" Salary : "+e.getSalary());
		System.out.println(" Designation : "+e.getDesignation());
		System.out.println(" Insurance Scheme : "+e.getInsuranceScheme());
		System.out.println("\n===================================================\n");
		
		
	}
	
	
	public void employeeInsuranceScheme() {
		System.out.println("Enter insurance scheme");
		String insurance = sc.nextLine();
		List<Employee> empList = esi.getAllEmployeesbyInsurance(insurance);
		iterateEmployeeList(empList);
		
		
	}
	public void employeeID() {
		System.out.println("Enter iD");
		int id = sc.nextInt();
		String name=sc.next();
		List<Employee> empList = esi.getEmployeeById(id,name);
		iterateEmployeeList(empList);
		
		
	}
	
	public void iterateEmployeeList(List<Employee> empList) {
		
		for (Employee employee : empList) {
			displayEmployee(employee);
		}

		
	}

}