package Practical;

import java.io.FileOutputStream;
/// write byte from string
public class FileOutputStreamExample {
  public static void main(String[] args) {
	try {
		FileOutputStream f = new FileOutputStream("D:\\test1.txt");
		String str="Welcome to Anudip Foundation";
		byte b[]=str.getBytes(); // converting string into byte array 
		f.write(b);
		f.close();
		System.out.println("Done");
	}
	catch(Exception e) {
		System.out.println(e);
	}
  }
}
