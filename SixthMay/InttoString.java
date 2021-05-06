//Program to convert the given integer values to the string
import java.util.Scanner;
public class InttoString {
	public static void ConvertInttoString(int num) {
		String s=String.valueOf(num);
		System.out.println("String values is " +s);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer value:");
		int num=sc.nextInt();
		ConvertInttoString(num);
		sc.close();
	}
}
