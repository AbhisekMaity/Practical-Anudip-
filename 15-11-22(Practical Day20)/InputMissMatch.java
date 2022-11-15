package Practical;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatch {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two number ");
	try {
		int x =sc.nextInt();
		int y =sc.nextInt();
		System.out.println(x/y);
	}
	catch(InputMismatchException e) {
		System.out.println(e);
	}
	catch(Exception e) {
		System.out.println(e);
	}
  }
}
