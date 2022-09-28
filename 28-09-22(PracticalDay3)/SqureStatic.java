package Practical;

public class SqureStatic {
  int a=20; // non static variable or instance variable
  static int squre(int x) {
	  return x*x;
  }
  public static void main(String[] args) {
	int result = SqureStatic.squre(5);
	System.out.println(result);
}
}
