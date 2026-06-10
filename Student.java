import java.util.*;
import java.util.Scanner;

class Student{
	
	static final int whole = 400;
	private int maths;
	private int physics;
	private int chem;
	private int bio;
	
	public int getMaths(){
		return maths;
	}
	
	public int getPhysics(){
		return physics;
	}
	
	public int getChem(){
		return chem;
	}
	
	public int getBio(){
		return bio;
	}
	
	public void setMaths(int maths){
		this.maths = maths;
	}
	
	public void setPhysics(int physics){
		this.physics = physics;
	}
	
	public void setChem(int chem){
		this.chem = chem;
	}
	
	public void setBio(int bio){
		this.bio = bio;
	}
	
	
	public int total(){
		return maths+physics+chem+bio;	
	}
	
	public double percentage(){
		return (total()*100)/whole;
	}
}

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		
		Student s1 = new Student();
		
		while(true){
			System.out.println("****************");
			System.out.println("Student Result Processor");
			System.out.println("****************");
			System.out.println("Enter the marks of Maths: ");
			s1.setMaths(sc.nextInt());
			System.out.println("Enter the marks of Physics: ");
			s1.setPhysics(sc.nextInt());
			System.out.println("Enter the marks of Chemistry: ");
			s1.setChem(sc.nextInt());
			System.out.println("Enter the marks of Bio: ");
			s1.setBio(sc.nextInt());
			
			System.out.println("Total Marks of Student: " + s1.total());
			System.out.println("Total Percentage of Student: " + s1.percentage());
			
			if(s1.percentage() >= 85){
				System.out.println("Grade: A" );
			}else if(s1.percentage()<85 && s1.percentage()>=70){
				System.out.println("Grade: B" );
			}else if(s1.percentage() <75 && s1.percentage() > 40){
				System.out.println("Grade: C" );
			}else{
				System.out.println("Fail");
			}
			
			
		}
		
		
		
	}
}