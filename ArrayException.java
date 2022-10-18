import java.util.Scanner;
import java.util.*;
public class ArrayException{
	public String getPriceDetails(){
		Scanner sc = new Scanner(System.in);
		int n,l;
		try{
			System.out.println("Enter the size of the array");
			l=sc.nextInt();
			int[] a= new int[l];
			System.out.println("Enter the elements of the array");
			for(int i=0;i<l;i++){
				a[i]=sc.nextInt();
			}
			System.out.println("Enter the index of the array");
				n=sc.nextInt();
				return("the array element is "+a[n]);
			}catch(ArrayIndexOutOfBoundsException e){
				return("array index out of range");
			}catch(InputMismatchException e){
				return("Input was not in the correct format");
		}
	}
	public static void main(String args[]){
		ArrayException obj = new ArrayException();
		System.out.println(obj.getPriceDetails());
	}
}