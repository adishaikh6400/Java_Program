class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        
        int n = sc.nextInt();
        boolean isPrime = true;
        
        if(n==0 || n==1){
            System.out.println("Not Prime");
        }else{
            for(int i=2 ; i<n; i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                    
                }
            }
        }
        if(isPrime==true){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
        
    }
}