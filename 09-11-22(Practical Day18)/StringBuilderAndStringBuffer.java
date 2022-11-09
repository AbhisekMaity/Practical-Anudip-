package Practical;

public class StringBuilderAndStringBuffer {
  public static void my() {
	  
	  // String buffer 
	  
	  StringBuffer s = new StringBuffer("Hello");// object of string buffer class
	  s.append("World");
	  System.out.println("String is " +s);//HelloWorld
	  s.insert(2, "Riya"); // (int off set, string s)
	  System.out.println("After insert string is " +s);
	  s.replace(1, 3, "java"); // (startwith, endwith, string s)
	  System.out.println("After replace "+s);
	  System.out.println("Capacity " +s.capacity());
	  
	  // String builder
	  
	  StringBuilder s1 = new StringBuilder("world");
	  s1.replace(1,3,"Java");
	  System.out.println("After replace " +s1);
	  s1.delete(1, 3);
	  System.out.println("After delete " +s1);
	  s1.reverse();
	  System.out.println("After reverse " +s1);
	  
  }
  public static void main(String[] args) {
	my();
}
}
