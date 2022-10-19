import java.util.Scanner;
public class Arithmetic{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a,b,o;
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Choose the operation to be performed");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		o=sc.nextInt();
		switch(o){
			case 1: a=a+b;
				System.out.println("The sum of two numbers is "+a);
				System.exit(0);
			case 2: a=a-b;
				System.out.println("The difference of two numbers is "+a);
				System.exit(0);
			case 3: a=a*b;
				System.out.println("The product of two numbers is "+a);
				System.exit(0);
			case 4: a=a/b;
				System.out.println("The quotient of two numbers is "+a);
				System.exit(0);
			default: System.out.println("Invalid input");
				 System.exit(0);
		}
	}
}