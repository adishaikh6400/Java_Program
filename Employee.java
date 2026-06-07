import java.util.Scanner;
import java.util.*;


class Employee{
	
	private int empid;
	private String empName;
	private double salary;
	private String dept;
	
	Employee(int empid, String empName, double salary, String dept){
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
	}
	
	public int getId(){
		return empid;
	}
	
	public String getName(){
		return empName;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public String getDept(){
		return dept;
	}
	
	public void setId(int empid){
		this.empid = empid;
	}
	public void setName(String empName){
		this.empName = empName;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public void setDept(String dept){
		this.dept = dept;
	}
	

	
}


public class Main{
	public static void main(String args[]){
		
		
		System.out.println("********************");
		System.out.println("Employee Management System");
		System.out.println("********************");
		

		System.out.println("1. Add mployees");
		System.out.println("2. Remove Employees");
		System.out.println("3. Update Salary");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		System.out.println(choice);
		
		
		
		
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		while(true){
			switch(choice){
			case 1:
			System.out.println("Enter Id");
			int id = sc.nextInt();
			
			System.out.println("Enter Name");
			String name = sc.next();
			
			System.out.println("Enter Salary");
			double sal =sc.nextDouble();
			
			System.out.println("Enter Department");
			String department = sc.next();
			break;
			
			Employee emp = new Employee(id,name,sal,department);
			employees.add(emp);
			System.out.println("Employee Added Successfully");
			}
		}
		
	}
} 	