//Program to Copy a File to another File

import java.io.*;
public class CopyFile {

	public static void main(String[] args) {
		try {
			File infile =new File("C:\\MyInputFile.txt");
    	    File outfile =new File("C:\\MyOutputFile.txt");
 
    	    FileInputStream fin = new FileInputStream("D:\\Training2021\\newclass.txt");
    	    FileOutputStream fout = new FileOutputStream("D:\\Training2021\\copynewclass.txt");
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    while ((length = fin.read(buffer)) > 0){
    	    	fout.write(buffer, 0, length);
    	    }
    	    fin.close();
    	    fout.close();

    	    System.out.println("File copied successfully!!");
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
