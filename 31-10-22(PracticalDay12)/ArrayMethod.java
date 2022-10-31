package Practical;

public class ArrayMethod {
 static int [] get() {
	 return new int[] {10,20,30};  // method which return an array 
	 
 }
 public static void main(String args[]) {
	 int arr[]=get();  //
	 for(int i=0;i<arr.length;i++) {  
		 System.out.println(arr[i]);
	 }
   }
}
