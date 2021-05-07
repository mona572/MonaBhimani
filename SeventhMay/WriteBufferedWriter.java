//Program to write to file using BufferedWriter

import java.io.*;
public class WriteBufferedWriter {

	public static void main(String[] args) {
		try {
			FileWriter fout=new FileWriter("D:\\Training2021\\class.txt");
			BufferedWriter bout=new BufferedWriter(fout);
			bout.write("welcome..");
			bout.close();
			fout.close();
			System.out.println("Successfully write");			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
