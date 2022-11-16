package Practical;

public class ThrowExample {
  public static void myDisplay(int a) throws ArithmeticException{
	  if(a>=0 && a<=35) {
		  throw new ArithmeticException("ljsdfljsdfj");
	  }
	  else {
		  System.out.println("dflg");
	  }
  }
  public static void main(String[] args) {
	myDisplay(30);
}
}
