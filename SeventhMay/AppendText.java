//Program to append text to a file using BufferedWriter, PrintWriter, FileWriter

import java.io.*;
public class AppendText {

	public static void main(String[] args) {
		try {
			String str="good morning";
			File file=new File("D:\\Training2021\\class.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fout=new FileWriter(file,true);
			BufferedWriter bout=new BufferedWriter(fout);
			bout.write(str);
			
			PrintWriter pout=new PrintWriter(bout);
			pout.println("");
			pout.println("First line");
			pout.println("Second line");
			bout.close();
			pout.close();
			System.out.println("Data sucessfully append ");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
