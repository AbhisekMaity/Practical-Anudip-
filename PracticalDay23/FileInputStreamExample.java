
package Practical;

import java.io.FileInputStream;
// read all character 
public class FileInputStreamExample {
  public static void main(String[] args) {
	try {
		// Write Byte to string
		FileInputStream f = new FileInputStream("D:\\test2.txt"); //destination 
		int i=0;
		while((i=f.read())!=-1) {
			System.out.print((char)i);
		
		}
		f.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
  }
}   
