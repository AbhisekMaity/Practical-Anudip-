package Practical;

abstract class Test{  // class should be abstract 
	abstract void display(); // abstract method 
	void show() {
		System.out.println("no abstract method invoked ");
	}
}
class AbstractMethod extends Test{  // first child class
	void display() {
		System.out.println("Display mehod invoked ");
	}
}
class Demo2 extends Test{  // second child class 
	void display() {
		System.out.println("Demo2 method invoded");
	}
}
public class MainAbstraction {
	public static void main(String[] args) {
		Test obj= new AbstractMethod();
		Test obj2= new Demo2();

		obj.display();
		obj2.display();
		obj.show();
		obj2.show();
		
	}

}
