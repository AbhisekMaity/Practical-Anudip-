package Practical;
// Final keyword --- cannot change the value of final variable 
// final variable, final class, final method 
public class FinalVariable {
	final int value=89;
	static int val=78;
	void display() {
		System.out.println(value);
		int val=67;  // we do this 
		System.out.println(val);
//		value=90; // here we cannot update the value 
	}
	public static void main(String[] args) {
		FinalVariable obj=new FinalVariable();
		obj.display();
		
	}

}
