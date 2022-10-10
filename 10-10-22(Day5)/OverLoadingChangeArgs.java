package Practical;

public class OverLoadingChangeArgs { 
	static int sum(int a,int b) {
		return a+b;
	}
    static int sum(int a,int b, int c) {
    	return a+b+c;
    }
    public static void main(String[] args) {
		System.out.println("The Addiion of two numbers is " +OverLoadingChangeArgs.sum(5,7));
		System.out.println("The Addiion of three numbers is " +OverLoadingChangeArgs.sum(5,7,8));

    }
}
