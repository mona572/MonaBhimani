//Program to read a file using BufferedInputStream

import java.io.*;
public class ReadBufferedInputStream {

	public static void main(String[] args) {
		try {
		FileInputStream fin=new FileInputStream("D:\\Training2021\\class.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		int i;
		while((i=bin.read())!=-1) {
			System.out.print((char)i);
		}
		bin.close();
		fin.close();
	} catch(Exception e) {
		System.out.println(e);
	}
	}
}
