package Practical;

public class ClassNameArray {
  public static void main(String[] args) {
	// dec and inc of an array
	  int arr[]= {1,2,3};
	  // getting the class name
	  Class a=arr.getClass();
	  String name=a.getName();
	  System.out.println(a);
}
}
