//Program to copy all elements of one array into another array
import java.util.Scanner;
public class ArrayCopy {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements you want in array");
		int n=sc.nextInt();
		int array1[]=new int[n];
		int array2[]=new int[array1.length];
		
		System.out.print("Enter all elements:");
		for(int i=0;i<n;i++) {
			array1[i]=sc.nextInt();
		}
		
		for(int i=0;i<array1.length;i++) {
			array2[i]=array1[i];
		}
		
		System.out.print("copy elements of one array into another array: ");
		for(int i=0;i<array2.length;i++)
		{
			System.out.print(array2[i] + " ");
		}
	}

}
