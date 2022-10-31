package Practical;

public class ArrayExample2 {
  public static void main(String[] args) {
	int a[]=new int[5];  // declaration as well as instantiation
	a[0]=2;
	a[1]=9;
	a[2]=5;
	a[3]=7;
	a[4]=1;
//	a[5]=8; // array out of bound exception that 
	// means compile successfully but run time error will occur
	// traversing an array 
	for(int i=0;i<a.length;i++) {  // here length is one of the property of an array 
		System.out.println(a[i]);
	}
}
}
