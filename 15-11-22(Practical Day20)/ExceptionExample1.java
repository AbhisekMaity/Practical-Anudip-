package Practical;
public class ExceptionExample1 {
	public static void main(String[] args) {
		try {
			int arr[]= {45,67};
//			System.out.println(10/0);

//			System.out.println(arr[8]);
		}
//		catch(ArithmeticException e1) {
//			System.out.println("1 st Exception ocurs here "+e1);
//		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("Exception ocurs here "+e2);
		}
//		finally {
			System.out.println("dljf");

//		}
	}
}
