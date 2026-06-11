import java.util.Scanner;

class EmployeeBonusCalc{
	
	String name;
	int sal;
	char rat;
	int per;
	
	public int calcBonus(){
		return (per*sal)/100;
	}
	
}

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			EmployeeBonusCalc v = new EmployeeBonusCalc();
			
			System.out.println("Enter Employee Name: ");
			v.name = sc.nextLine();
			
			System.out.println("Enter Employee Sal: ");
			v.sal = sc.nextInt();
			
			System.out.println("Enter Employee Rating: ");
			v.rat = sc.next().charAt(0);
			
			switch(v.rat){
				case 'A':
				v.per = 20;
				break;
				
				case 'B':
				v.per = 15;
				break;
				
				case 'C':
				v.per = 10;
				break;
				
				case 'D':
				v.per = 5;
				break;
			}
			
			System.out.println("Bonus Amount: " +v.calcBonus());
			System.out.println("Final Salary: " + (v.calcBonus()+v.sal));
			
			
		}
	}
}