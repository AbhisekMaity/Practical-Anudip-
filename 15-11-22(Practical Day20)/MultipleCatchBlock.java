package Practical;

public class MultipleCatchBlock {
  public static void show() {
	  try {
		  int i = 50/0;
		  System.out.println(i);// Arithmetic exception
		  int arr[]=new int[3];
		  arr[7]=34;
	  }
	  catch(ArithmeticException e) {
		  System.out.println("Only first block will execute ");
		  
		  
	  }
	  catch(ArrayIndexOutOfBoundsException ai) {
		  System.out.println("Array index outof bound exception occur here ");
		  
	  }
	  finally {
		  System.out.println("End of the program ");
	  }
  }
  public static void main(String[] args) {
	  MultipleCatchBlock obj =  new MultipleCatchBlock();
	  obj.show();
}
}
