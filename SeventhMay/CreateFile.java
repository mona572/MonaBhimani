//Program to create a text file

import java.io.*;
public class CreateFile {

	public static void main(String[] args) {
		File file=new File("D:\\Training2021\\class.txt");
		boolean result;
		try {
			result=file.createNewFile();
			if(result) {
				System.out.println("file created..  "+file.getCanonicalFile());
			}
			else {
				System.out.println("file already exist at that location..  "+file.getCanonicalPath());
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
