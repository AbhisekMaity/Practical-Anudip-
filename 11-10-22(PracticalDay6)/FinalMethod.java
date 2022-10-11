
package Practical;
//Final keyword --- cannot change the value of final variable 
//final variable, final class, final method 
public class FinalMethod {
	// create final method 
	final void display() {
		System.out.println("This is a final method ");
	}
	// we cannot override final method 
	
//	class Main extends FinalMethod{
//		public final void display() {  // we cannot do it 
//			System.out.println("This is overrden final method");
//		}
//	}
	public static void main(String[] args) {
		FinalMethod obj=new FinalMethod();
		obj.display();
		
	}

}
