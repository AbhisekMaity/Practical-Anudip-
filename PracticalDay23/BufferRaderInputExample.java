



package Practical;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
// read all character 
public class BufferRaderInputExample {
  public static void main(String[] args) {
	try {
		// Write Byte to string
		FileInputStream f = new FileInputStream("D:\\test1.txt"); //destination
		BufferedInputStream b = new BufferedInputStream(f);
		int i=0;
		while((i=b.read())!=-1) {
			System.out.print((char)i);
		
		}
		f.close();
		b.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
  }
}   
