package Pracital;

import java.util.HashSet;

public class HashsetDemo {
  public static void main(String[] args) {
	// creating Hashset and adding elements 
	  HashSet<String> set1 = new HashSet();
	  set1.add("ram");
	  set1.add("rima");
	  set1.add("rima");

	  set1.add("shyam");

	  set1.add("ram");

	  set1.add("ramesh");
// original list 
	  System.out.println("original list " +set1);
	  // now removing the specfic element from the linked set
	  
	  set1.remove("ram");
	  
	  System.out.println("After rmoving the set is " +set1);
	  
	  HashSet<String> set2 = new HashSet();
	  set2.add("Pallabi");
	  set2.add("Rahul");
	  System.out.println("New set "+set2);
	  // add all
	  set1.addAll(set2);
	  System.out.println("Updated list :"+set1);
	  
	  // removed all
	  
	  set1.removeAll(set1);
	  System.out.println("After removing "+set1);
	  
	  
	  
	  
	  
	  
	  
	 
	  

	  
}
}
