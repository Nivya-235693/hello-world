import java.util.Scanner;
public class Pattern2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number of rows");		
		n=sc.nextInt();
		for(int i=n;i>=0;i--){
			for(int j=i;j<n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}