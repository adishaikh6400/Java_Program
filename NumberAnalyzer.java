import java.util.Scanner;

class NumberAnalyzer{
	public static void main(String args[]){
		
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true){
			System.out.println("Enter the Number: ");
			int a = sc.nextInt();
			if(a<0){
			System.out.println("Number is Negative");
			}else if(a>0 && a%2==0){
				System.out.println("Number is even and Positive");
			}else if(a>0 && a%2==1){
				System.out.println("Number is Odd and Positive");
			}else{
				System.out.println("Number is Zero");
			}
		}
		
	}
}