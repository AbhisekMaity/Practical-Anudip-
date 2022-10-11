package Practical;

// super keyword -- reference variable which refer immediate parent class (instance variable,method and 
// constructor.
// in this program we print the instance variable with the help of super keyword
class Shape {
	String name="circle";
}
class Size extends Shape{
	String name ="Triangle";
    void print() {
    	System.out.println(name);  // first print this one 
    	System.out.println(super.name); // then print this one 
    }
}
public class SuperIV {
	public static void main(String[] args) {
		
		Size obj=new Size();
		obj.print();
	}
	

}
