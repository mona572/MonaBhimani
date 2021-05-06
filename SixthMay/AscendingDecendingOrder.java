//Program to sort the elements of an array in ascending order and decending order
import java.util.Scanner;

public class AscendingDecendingOrder {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements you want in array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.print("Enter all elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int temp=0;
		 for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	          
	        System.out.println(); 
	        System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	         }		
	        for (int m = 0; m < arr.length; m++) {     
	            for (int n1 = m+1; n1 < arr.length; n1++) {     
	               if(arr[m] < arr[n1]) {    
	                   temp = arr[m];    
	                   arr[m] = arr[n1];    
	                   arr[n1] = temp;    
	               }     
	            }     
	        }  
	        System.out.println();      
	        System.out.println("Elements of array sorted in descending order: ");    
	        for (int m = 0; m < arr.length; m++) {     
	            System.out.print(arr[m] + " ");   
	}
	}
}
