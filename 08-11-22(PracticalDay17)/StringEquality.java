package Practical;

import java.util.Scanner;

public class StringEquality {
  public static void main(String[] args) {
	String str1;
	String str2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first string ");
	str1=sc.nextLine();
	System.out.println("Enter the second string ");

	str2=sc.nextLine();
	// comparing to string
	if(str1.equals(str2)) {
		System.out.println("Equal String");
	}
	else {
		System.out.println("Not Equal String ");
	}
	
  }
}
