package Practical;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputExample {
  public static void main(String[] args) throws IOException {
	FileOutputStream f1 = new FileOutputStream("D:\\test1.txt");
	ByteArrayOutputStream bout = new ByteArrayOutputStream();
    bout.write(65);
    bout.writeTo(f1);
    bout.flush();
    bout.close();
    System.out.println("Done");
  }
}
