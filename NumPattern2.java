import java.util.Scanner;
public class NumPattern2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,k=1;
		System.out.println("Enter number of rows");		
		n=sc.nextInt();
		for(int i=n;i>=0;i--){
			for(int j=i;j<n;j++){
				System.out.print(k);
				k++;	
			}
			k=1;
			System.out.println();
		}
	}
}