package Practical;

public class ClonningAnArray {
  public static void main(String[] args) {
	int []arr= {44,4,5,6};   // inc and dec an array
	System.out.println("Print the actual array ");
	for(int i:arr) {  // for each loop for printing the original array 
		System.out.println(i);  // printing array values
	}
	int carr[] =arr.clone();  // creating clone
	for(int i: carr) { //for each loop for printing the cloning  array
		System.out.println(i);
		
	}
	System.out.println("Now check both are equal or not ");
	System.out.println(arr==carr); // checking 
	
}
}
