import java.util.Scanner;
public class NumPattern1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,k=0;
		System.out.println("Enter number of rows");		
		n=sc.nextInt();
		for(int i=n;i>=0;i--){
			for(int j=i;j<n;j++){
				System.out.print(k);	
			}
			k++;
			System.out.println();
		}
	}
}