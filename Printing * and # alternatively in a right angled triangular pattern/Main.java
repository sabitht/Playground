import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      
      int n = in.nextInt();
        int k= 0;
        for(int r =1 ; r <= n ; r++) {
            for(int c =1 ; c <= r ; c++) {
                if(k == 0) {
                    System.out.print("*");
                    k = 1;
                }
                else {
                    System.out.print("#");
                   k = 0;
                }
     
            }
            System.out.print("\n");
        }
       

    }
}