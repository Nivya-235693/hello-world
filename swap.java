import java.util.Scanner;
public class swap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.println("enter two numbers");
		i = sc.nextInt();
		j = sc.nextInt();
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("swaped value is "+i+" "+j); 
	}
}