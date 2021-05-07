//Program to read a file using BufferedReader

import java.io.*;
public class ReadBufferedReader {

	public static void main(String[] args) {
		try {
			FileReader fin=new FileReader("D:\\Training2021\\class.txt");
			BufferedReader bin=new BufferedReader(fin);
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
