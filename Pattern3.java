import java.util.Scanner;
public class Pattern3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter a number");
		n = sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=n;j>i;j--){
				System.out.print(" ");
			}
		for(int k=0;k<i*2-1;k++){
			System.out.print("*");
		}
		System.out.println();
	}
}}