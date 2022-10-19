import java.util.Scanner;

public class Diamond2 {

   public static void main(String[] args) {
  
      Scanner scan = new Scanner(System.in);
      int n = 0;
      System.out.println("Enter Positive Number");
      n=scan.nextInt();
      for(int i=1; i <= n+1; i++) {
         for(int j = i; j <= n; j++) {
            System.out.print(" ");
         }
         for(int k = 1; k <= 2*i-1; k++) {
            if(k==1 || k==(2*i-1) )
            System.out.print("*");
            else
            System.out.print(" ");
	}
         System.out.println();
  	}
      for(int i=n; i >= 1; i--) {
         for(int j=n; j >= i; j--) {
            System.out.print(" ");
         }
         for(int k=1; k <= 2*i-1; k++) {
            if(k==1 || k==(2*i-1) )
            System.out.print("*");
            else
            System.out.print(" ");
         }
         System.out.println();
      }
   }

}
