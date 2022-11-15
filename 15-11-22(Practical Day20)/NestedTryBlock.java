package Practical;
import java.util.*;
public class NestedTryBlock {
  public static void main(String[] args) {
	try {  // outer try block
		try {  // inner try block
			System.out.println("Going to divide by zero exception");
			int b=19/0;
			}
		catch(ArithmeticException e) {
			System.out.println(e);
			 try  { // this is also inner try block
				 int arr[]=new int[5];
				 arr[9]=90;
				 
			 }
			 catch(ArrayIndexOutOfBoundsException ie) {
				 System.out.println("Other statement ");
				 
			 }
		}
	}
		
			 catch(Exception ec) {
				 System.out.println("Handel the exception for outer try block ");
			 }
			 System.out.println("End of the program ");
		
    }
  }

