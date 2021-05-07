//Program to delete file using delete() Method

import java.io.*;
public class DeleteFile {

	public static void main(String[] args) {
		try {
			File file=new File("D:\\Training2021\\demo.txt");
			if(file.delete()) {
				System.out.println(file.getName() + " deleted");
			}
			else {
				System.out.println("failed");
				
			}	
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
