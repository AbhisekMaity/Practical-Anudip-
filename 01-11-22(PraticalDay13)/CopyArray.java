package Practical;

public class CopyArray {
	public static void main(String[] args) {
		// declaring a source array 
		char[] copyFrom= {'d','e','c','f','f','e','i','n'};
		// dec destination array 
		char[]copyTo=new char[7]; // new array
		
		System.arraycopy(copyFrom,2,copyTo,2,5);
	 System.out.println(String.valueOf(copyTo));
	}
 
	}
