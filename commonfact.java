import java.util.Scanner;
public class commonfact{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a,b,flag=0;
		System.out.println("enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>b){
			for(int i=1;i<=a;i++){
				if((a%i==0) && (b%i==0)){
					flag++;
				}
			}
		}
		else{
			for(int i=1;i<=b;i++){
				if((a%i==0) && (b%i==0)){
					flag++;
				}
			}
		}
		System.out.println("no. of common factors are "+flag);
	}
}

		