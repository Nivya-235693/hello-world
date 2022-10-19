import java.util.Scanner;
public class Temp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int o;
		double a,b=0;
		System.out.println("Choose the operation to be performed");
		System.out.println("1.Convert Celsius to Fahrenheit");
		System.out.println("2.Convert Fahrenheit to Celsius");
		o=sc.nextInt();
		switch(o){
			case 1: System.out.println("Enter the celcius value");
				a=sc.nextInt();
				b=((9*a)/5)+32;
				System.out.println("The Fahreinhiet value is "+b);
				System.exit(0);
			case 2: System.out.println("Enter the Fahrenheit value");
				a=sc.nextInt();
				b=(a-32)*5/9;
				System.out.println("The celcius value is "+b);
				System.exit(0);
			default: System.out.println("Invalid input");
				System.exit(0);
		}
	}
}