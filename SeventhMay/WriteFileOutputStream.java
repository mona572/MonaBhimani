//Program to write to a file using FileOutputStream

import java.io.*;
public class WriteFileOutputStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("D:\\Training2021\\class.txt");
			String s="Good Morning!";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Successfully write");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
