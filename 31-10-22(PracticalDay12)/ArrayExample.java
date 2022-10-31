package Practical;

public class ArrayExample {
 public static void main(String[] args) {
  // array declaration
	 String name[] = {"Abhisek","Devid","Ronit","Amit","Sayani","Binod"};
	for(int i=0;i<name.length;i++) {
		System.out.println(name[i]);
	}
	System.out.println();
// another array declaration
	int [] phone= {12,56,78,23,56,78,90,123,456,789};
	// for each loop 
	for(int n : phone) {
		System.out.println(n);
	}
}
}
