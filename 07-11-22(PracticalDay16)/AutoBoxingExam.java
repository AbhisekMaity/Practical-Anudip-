package Practical;

import java.util.ArrayList;

public class AutoBoxingExam {
  public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	// creating an empty array list of integer 
	a1.add(1); // adding int primitive type value by using add()method 
	a1.add(2);
	a1.add(3);  // auto boxing 
	System.out.println("ArrayList :" +a1);
}
}
