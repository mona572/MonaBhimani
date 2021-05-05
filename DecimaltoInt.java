//Program to convert the given decimal number into integer

import java.util.Scanner;
public class DecimaltoInt {

	public static void main(String[] args) {
		double dval;
		int ival;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal Value");
		dval = sc.nextDouble();
		ival = (int) dval;
		System.out.println("Integer Value:\n" + ival);
		
	}

}
