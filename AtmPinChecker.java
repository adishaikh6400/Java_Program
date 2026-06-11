import java.util.Scanner;


class AtmPinChecker{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		
		int pin = 1234;
		
		for(int i=3; i>=1; i--){
			
			System.out.println("Enter Your PIN");
			int a = sc.nextInt();
			
			if(a==pin){
				System.out.println("Login Successfull");
				System.out.println("Welcome to ATM Service");
				break;
				
			}else{
				System.out.println("Invalid Pin");
				System.out.println("Attempts Remaining" +i);
			}
			
		}
		System.out.println("Card Blocked. Please contact the bank." );
		
		
	}
}