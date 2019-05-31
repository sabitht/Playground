import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
	Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
      
        // Initialize sum value as 0
	    int sum = 0;
      
		while(n > 0)
		{ 
          
		   int rem = n % 10;
		   sum = sum + rem;
		   n = n / 10;
		}
		System.out.print(sum);
    
    }
}