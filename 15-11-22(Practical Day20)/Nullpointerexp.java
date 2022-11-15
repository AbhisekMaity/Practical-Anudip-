package Practical;

public class Nullpointerexp {
  // int a =10;
	// method invoked by using null object 
//	public static  Nullpointerexp nullPointer() {
//		return null;
	String str  = null; // string value null
	int arr[]=null;// array object null
	String convert (String s) {
		return s.toUpperCase();
	}
	public static void main(String[] args) {
		Nullpointerexp obj = new Nullpointerexp();
		System.out.println(obj.convert(null));
		System.out.println(obj.arr.length);
		System.out.println(obj.arr.equals("Abhisek"));
	}
}
