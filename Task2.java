import java.util.*;

class Task2{
	public static void main(String args[]){
		
		ArrayList<Products> prod = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while (true){
			
			Products p = new Products();
			
			System.out.println("Enter Product Id :");
			p.setprodId(sc.nextInt());
			sc.nextLine(); // consume newline

			System.out.println("Enter Product Name :");
			p.setprodName(sc.nextLine());

			System.out.println("Enter Product Price :");
			p.setprodPrice(sc.nextDouble());
			sc.nextLine(); // consume newline

			System.out.println("Enter Product Category :");
			p.setprodCategory(sc.nextLine());
			
			prod.add(p);
			
			System.out.println("Do you want to add products: y/n");
			
			char choice = sc.next().charAt(0);

			if(choice == 'n' || choice == 'N') {
				break;
					
			}
		}
		
		for (Products pr: prod){
			System.out.println(pr);
		}
		
	}
	
}

class Products{
	
	private int prodId;
	private String prodName;
	private double price;
	private String category;
	
	public int getId(){
		return prodId;
	}
	
	public String getprodName(){
		return prodName;
	}
	
	public double getprice(){
		return price;
	}
	
	public String getcategory(){
		return category;
	}
	
	public void setprodId(int prodId){
		this.prodId = prodId;
	}
	
	public void setprodName(String prodName){
		this.prodName = prodName;
	}
	
	public void setprodPrice(double price){
		this.price = price;
	}
	
	public void setprodCategory(String category){
		this.category = category;
	}
	
	
	@Override
    public String toString() {
        return "ID = " + prodId +
               ", Product = " + prodName +
               ", Price = " + price +
               ", Category = " + category;
    }
	
	@Override
	public boolean equals(Object obj){
		
		if(this==obj){
			return true;
		}
		
		if(obj == null || getClass() != obj.getClass()){
			return false;
		}
		
		
		Products p = (Products) obj;
		return this.prodId == p.prodId; 
	}
	
	@Override
	public int hashCode() {
		return Integer.hashCode(prodId);
	}
	
}
