import java.util.Scanner;



class Vehicle{
	String vehicleType;
	String vehicleNum;
	String ownerName;
	int price;
	int year;
	int airBags;
	
	public void report(){
		
	}
}


class Car extends Vehicle{
	
	
	int insuranceRule = 4;
	int roadtax = 8;
	
	@Override
	public void report(){
		
		double insP = (insuranceRule/100.0)*price;
		double roadT = (roadtax/100.0)*price;
		
		System.out.println("Insurance Report");
		System.out.println("Vehicle Type: " + vehicleType);
		System.out.println("Owner Name: " + ownerName);
		System.out.println("Vehicle Price: " + price);
		System.out.println("Insurance Premium: "+ insP);
		System.out.println("Road Tax: "+ roadT);
		System.out.println("Total Charges: "+ (insP+roadT));
	}
}



class Bike extends Vehicle{
	
	
	int insuranceRule = 2;
	int roadtax = 5;
	
	@Override
	public void report(){
		
		double insP = (insuranceRule/100.0)*price;
		double roadT = (roadtax/100.0)*price;
		
		System.out.println("Insurance Report");
		System.out.println("Vehicle Type: " + vehicleType);
		System.out.println("Owner Name: " + ownerName);
		System.out.println("Vehicle Price: " + price);
		System.out.println("Insurance Premium: "+ insP);
		System.out.println("Road Tax: "+ roadT);
		System.out.println("Total Charges: "+ (insP+roadT));
	}
}

class Truck extends Vehicle{
	
	
	int insuranceRule = 6;
	int roadtax = 10;
	
	@Override
	public void report(){
		
		double insP = (insuranceRule/100.0)*price;
		double roadT = (roadtax/100.0)*price;
		
		System.out.println("Insurance Report");
		System.out.println("Vehicle Type: " + vehicleType);
		System.out.println("Owner Name: " + ownerName);
		System.out.println("Vehicle Price: " + price);
		System.out.println("Insurance Premium: "+ insP);
		System.out.println("Road Tax: "+ roadT);
		System.out.println("Total Charges: "+ (insP+roadT));
	}
}





class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Enter the type of Vehicle");
			String type = sc.next();
			
			Vehicle v;

			if(type.equalsIgnoreCase("Car")) {
				v = new Car();
			}
			else if(type.equalsIgnoreCase("Bike")) {
				v = new Bike();
			}
			else if(type.equalsIgnoreCase("Truck")) {
				v = new Truck();
			}
			else {
				System.out.println("Invalid Vehicle Type");
				continue;
			}
			
			v.vehicleType = type;
			
			System.out.println("Enter the Number of Vehicle");
			v.vehicleNum = sc.next();
			
			sc.nextLine();
			System.out.println("Enter the Name of Owner");
			v.ownerName = sc.nextLine();
			System.out.println("Enter the Price of Vehicle");
			v.price = sc.nextInt();
			System.out.println("Enter the Year");
			v.year = sc.nextInt();
			System.out.println("Enter the Airbags");
			v.airBags = sc.nextInt();
			
			v.report();
			
			System.out.println("Do you want to continue: yes/no");
			String choice = sc.next();
			
			if(choice.equalsIgnoreCase("no")){
				break;
			}
			
			
		}
	}
}