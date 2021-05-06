//Program to round off the given decimal number and store into String
import java.util.Scanner;
public class Roundoff {
	
	public static void FindRoundoff(double dnum) {
		int temp;
		temp=(int) Math.round(dnum);
		String s=String.valueOf(temp);
		System.out.println("round off " +s);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal number:");
		double dnum=sc.nextDouble();
		FindRoundoff(dnum);
		sc.close();
	}

}


