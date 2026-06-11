import java.util.Scanner;

class Calculator{
	
	public int calculate(int x, int y){
		return x+y;
	}
	
	public int calculate(int x, int y, int z){
		return x+y+z;
	}
	
	public double calculate(double x, double y){
		return x+y;
	}
	
	public double calculate(double x, double y, double z){
		return x*y*z;
	}
}

class Main{
	public static void main(String args[]){
		Calculator c = new Calculator();
		System.out.println(c.calculate(5.0,4.0,7.0));
	}
}