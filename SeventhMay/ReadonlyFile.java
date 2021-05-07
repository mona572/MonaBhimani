//Program to make a File Read Only

import java.io.*;

public class ReadonlyFile {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\Training2021\\readfile.txt");
		boolean flag=file.setReadOnly();
		if(flag==true) {
			System.out.println("File is read only mode");
		}
		else {
			System.out.println("unsuccessful operation");
		}

	}

}
