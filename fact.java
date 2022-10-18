import java.util.Scanner;
public class fact{
	public static void main(String args[]){
		int i,k=1;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		if(i==0 || i==1){
			System.out.println("factorial of "+i+" = "+k);
			System.exit(0);
		}
		else{
			for(int j=1;j<=i;j++){
				k=k*j;
			}
		}
	System.out.println("factorial of "+i+" = "+k);
	}
}	