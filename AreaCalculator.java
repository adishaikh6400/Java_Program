class AreaCalculator{
	
	public int calculateArea(int s){
		return s*s;
	}
	
	public int calculateArea(int l, int w){
		return l*w;
	}
	
	public double calculateArea(double r){
		return 3.14*r*r;
	}
	
	public double calculateArea(double b, double h){
		return 0.5 * b * h;
	}
}


class Main{
	public static void main(String args[]){
		AreaCalculator a = new AreaCalculator();
		System.out.println(a.calculateArea(5.5, 5.5));
	}
}