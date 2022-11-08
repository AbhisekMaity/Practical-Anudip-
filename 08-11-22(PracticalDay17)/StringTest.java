package Practical;

import java.util.Scanner;

public class StringTest {
   public void show() {
	   Scanner sc = new Scanner(System.in); // user input
	   System.out.println("Enter the string");
	   String A=sc.next();
	   String B=sc.next();
	   
	   System.out.println(A.length()+B.length());
	   System.out.println((A.compareTo(B)>0) ? "Yes":"NO");
	   System.out.println(A.substring(0,4).toUpperCase()+A.substring(2)+" "+B.substring(0,1).toLowerCase()+B.substring(1));
	   
	   
   }
   public static void main(String[] args) {
	   StringTest obj = new StringTest();
	   obj.show();
	
}
}
