
package Practical;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
/// write byte from string
public class BufferOutputExample {
  public static void main(String[] args) {
	try {
		FileOutputStream f = new FileOutputStream("D:\\test1.txt");
		BufferedOutputStream b=new BufferedOutputStream(f);
		String str="Welcome to Anudip Foundation and welcome to java world";
		byte b1[]=str.getBytes(); // converting string into byte array 
		f.write(b1);
		f.close();
		b.close();
		System.out.println("Done");
	}
	catch(Exception e) {
		System.out.println(e);
	}
  }
}
