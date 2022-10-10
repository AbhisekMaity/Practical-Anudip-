
package Practical;

public class OverLoadingTypePromotion { 
	void  add(int a,long b) {
		System.out.println("The addition is "+(a+b));
	}
    public void add(int a,int b, int c) {
		System.out.println("The addition is "+(a+b+c));

    }
    public static void main(String[] args) {
    	OverLoadingTypePromotion obj = new OverLoadingTypePromotion();
    	obj.add(22, 78, 45);
    	obj.add(56,68);
    }
}
