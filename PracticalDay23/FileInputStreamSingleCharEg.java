

package Practical;

import java.io.FileInputStream;
// read single character 
public class FileInputStreamSingleCharEg {
  public static void main(String[] args) {
	try {
		FileInputStream f = new FileInputStream("D:\\test2.txt"); //destination 
		int i=f.read();
			System.out.print((char)i); // convert into character 
		
		f.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
  }
}   

