

package Practical;

public class OverloadingChangingDataTypeOfagrs { 
	static int sum(int a,int b) {
		return a+b;
	}
    static double sum(double a,int b) {
    	return a+b;
    }
    static double sum(double a,double b) {
    	return a+b;
    }
    static float sum(float a,float b) {
    	return a+b;
    }
    public static void main(String[] args) {
		System.out.println("The Addiion of two integers numbers is " +OverloadingChangingDataTypeOfagrs.sum(5,7));
		System.out.println("The Addiion of int and double numbers is " +OverloadingChangingDataTypeOfagrs.sum(7.6,8));
		System.out.println("The Addiion of two double numbers is " +OverloadingChangingDataTypeOfagrs.sum(7.6,8.8));
		System.out.println("The Addiion of two float numbers is " +OverloadingChangingDataTypeOfagrs.sum(7.6f,8.9f));

    }
}
