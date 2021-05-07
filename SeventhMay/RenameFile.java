//Program to rename file.
import java.io.*;
public class RenameFile {

	public static void main(String[] args) {
		File oldfile=new File("D:\\Training2021\\class.txt");
		File newfile=new File("D:\\Training2021\\newclass.txt");
		
		if(oldfile.renameTo(newfile)) {
			System.out.println("Renamed");
		}
		else {
			System.out.println("Error");
		}

	}

}
