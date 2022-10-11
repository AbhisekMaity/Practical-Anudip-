package Practical;
//super keyword -- reference variable which refer
//immediate parent class (instance variable,method
//and constructor.
// here in this program we called the parent class method with the help of child class
// i mean with the help of super keyword 

class Shape1{  // parent class
	void print() {
		System.out.println("print circle");
	}
}
class Size1 extends Shape1{ // child class
	void print() {
		System.out.println("print triangle");
	}
	void display() {  // new method of child class 
		System.out.println("print nothing");
	}
	void show() {  // final method
		display();
		print();  // this is own class method 
		super.print();  // it refer immediate parent class method 
	}
}
public class SuperMethod {
	public static void main(String[] args) {
		Size1 obj=new Size1();
		obj.show();
	}

}
