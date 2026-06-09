import java.util.Scanner;
import java.util.*;



class Task1{
	public static void main (String args[]){
		
		ArrayList <Employee> emp = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			Employee e = new Employee();
			
			System.out.println("Enter ID: ");
			e.setId(sc.nextInt());
			
			System.out.println("Enter Name: ");
			e.setName(sc.next());
			
			System.out.println("Enter Salary: " );
			e.setsalary(sc.nextDouble());
			
			System.out.println("Enter Department: ");
			e.setdepartment(sc.next());
			
			emp.add(e);
			
			System.out.print("Add another employee? (y/n): ");
			char choice = sc.next().charAt(0);
			sc.nextLine();

			if(choice == 'n' || choice == 'N') {
				break;
			}
		}
		
		for(Employee e : emp){
			System.out.println(
			e.getId() + " " +
			e.getempName() + " " +
			e.getsalary() + " " +
			e.getdepartment()
			);
		}
	
	
		
	}
	
}

class Employee{
	
	private int empID;
	private String empName;
	private double salary;
	private String department;
	
	public int getId(){
		return empID;
	}
	
	public String getempName(){
		return empName;
	}
	
	public double getsalary(){
		return salary;
	}
	
	public String getdepartment(){
		return department;
	}
	
	public void setId(int empID){
		this.empID = empID;
	}
	
	public void setName(String empName){
		this.empName = empName;
	}
	
	public void setsalary(double salary){
		this.salary = salary;
	}
	
	public void setdepartment(String department){
		this.department = department;
	}
	
}