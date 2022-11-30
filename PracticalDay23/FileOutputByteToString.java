package Practical;

import java.io.FileOutputStream;
// write byte to string using FOS
public class FileOutputByteToString {
  public static void main(String[] args) {
	try {
		// Write Byte to string
		FileOutputStream f = new FileOutputStream("D:\\test1.txt"); //destination 
		f.write(67);
		f.close();
		System.out.println("Done");
	}
	catch(Exception e) {
		System.out.println(e);
	}
  }
}   
