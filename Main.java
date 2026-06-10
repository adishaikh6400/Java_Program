import java.util.Scanner;
import java.util.*;
import java.time.LocalDate;


class Employee{
	
	private int empid;
	private String empName;
	private double salary;
	private String dept;
	private LocalDate joiningDate;
	
	Employee(int empid, String empName, double salary, String dept, LocalDate joiningDate){
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
		this.joiningDate = joiningDate;
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
	
	public LocalDate getjoiningDate(){
		return joiningDate;
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
		
		ArrayList<Employee> employees = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
		System.out.println("\n********************");
		System.out.println("Employee Management System");
		System.out.println("********************");
		

		System.out.println("1. Add Employees");
		System.out.println("2. Display Employees");
		System.out.println("3. Remove Employee");
		System.out.println("4. Search Employee");
		System.out.println("5. Update Salary of Employee");
		System.out.println("6. Highest Paid EMployee");
		System.out.println("7. Group Employees By Department");
		System.out.println("8. Sort Employees by Salary");
		System.out.println("9. Sort Employees by Joining Date");
		
		int choice = sc.nextInt();
		System.out.println(choice);
			
			
			
			switch(choice){
			//Stores employees data 	
				case 1:
				System.out.println("Enter Id");
				int id = sc.nextInt();
				
				System.out.println("Enter Name");
				String name = sc.next();
				
				System.out.println("Enter Salary");
				double sal =sc.nextDouble();
				
				System.out.println("Enter Department");
				String department = sc.next();
				
				System.out.println("Enter Date of joining: (yyyy-mm-dd)");
				LocalDate jd = LocalDate.parse(sc.next());
				
				Employee emp = new Employee(id,name,sal,department,jd);
				employees.add(emp);
				System.out.println("Employee Added Successfully");
				break;
				
				//Display Employees
				case 2:
				
				for(Employee e : employees){
					System.out.println(
					e.getId() + " " +
					e.getName() + " " +
					e.getSalary() + " " +
					e.getDept()
					);
				}
				break;
				
				//Remove Employee
				case 3:

				System.out.println("Enter Employee ID to remove:");
				int removeId = sc.nextInt();

				boolean rfound = false;

				for(Employee e : employees){

					if(e.getId() == removeId){

						employees.remove(e);
						rfound = true;

						System.out.println("Employee Removed Successfully");
						break;
					}
				}

				if(! rfound){
					System.out.println("Employee Not Found");
				}

				break;
				
				
				
				//Search Employees by  ID 
				case 4:
				System.out.println("Enter Employee Id to Search");
				int searchEmpbyId = sc.nextInt();
				
				boolean isFound = false;
				for(Employee e : employees){
					if(e.getId() == searchEmpbyId){
						isFound = true;
						System.out.println(
					e.getId() + " " +
					e.getName() + " " +
					e.getSalary() + " " +
					e.getDept()
					);
					break;
					}
					
				}
				if(!isFound){
					System.out.println("Employee Not Found");
				}

				break;
				
				
				//Update Salary
				case 5:
				System.out.println("Enter Employee Id to Update Salry");
				int searchEmpId = sc.nextInt();
				boolean uFound = false;
				
				for(Employee e : employees){
					if(e.getId() == searchEmpId){
						uFound = true;
						System.out.println(
					e.getId() + " " +
					e.getName() + " " +
					e.getSalary() + " " +
					e.getDept()
					);
					
					System.out.println("Enter the amt to update salary");
					double uSal = sc.nextDouble();
					e.setSalary(uSal);
					System.out.println(
					e.getId() + " " +
					e.getName() + " " +
					e.getSalary() + " " +
					e.getDept()
					);
					break;
					}
				}
				if(!uFound){
					System.out.println("Employee Not Found");
				}

				break;
				
				
				//Highest Paid Employee
				case 6:
				 Employee highestPaid = employees.get(0);
				 
				 for(Employee e : employees){
					 if(e.getSalary() > highestPaid.getSalary()){
						 highestPaid = e;
					 }
				 }
				 
				 System.out.println(
					highestPaid.getId() + " " +
					highestPaid.getName() + " " +
					highestPaid.getSalary() + " " +
					highestPaid.getDept()
					);
				 break;
				 
				 
				 //Group
				 case 7:
				 
				 Map<String, List<Employee>> deptMap = new HashMap<>();
				 
				 for(Employee e : employees){
					 String dept = e.getDept();
					 
					 //if dept not conatins 
					 if(!deptMap.containsKey(dept)){
						 deptMap.put(dept , new ArrayList<>());
					 }
					 deptMap.get(dept).add(e);
				 }
				 
				 for(String dept: deptMap.keySet()){
					 System.out.println("\nDepartment: " +dept);
					 
					 for(Employee e : deptMap.get(dept)){
						 System.out.println(
						 e.getId() + " "+
						 e.getName() + " " +
						 e.getSalary() + " " +
						 e.getDept()
						 );
					 }
				 }
				 break;
				 
				 
				 //Sort by Salary
				 case 8:
				 
				 Collections.sort(employees , (e1,e2) ->
				 
				 Double.compare(e1.getSalary(), e2.getSalary())
				 );
				 
				 for(Employee e: employees){
					 System.out.println(
					 e.getId() + " " +
					 e.getName() + " " +
					 e.getSalary() + " " +
					 e.getDept()
					 );
				 }
				 break;
				 
				 //Sort Employees by joining Date
				 
				 case 9:
				 
				 Collections.sort(
				 employees,
				 Comparator.comparing(Employee :: getjoiningDate)
				 );
				 
				 for(Employee e : employees){
					 System.out.println(
					 e.getId() + " " +
					 e.getName() + " " +
					 e.getSalary() + " " +
					 e.getDept()+ " " +
					e.getjoiningDate()
					 );
				 }
				 
				 
				 
				 break;
				 
				 
				 
				
				
			}
			
		}
		
	}
} 	