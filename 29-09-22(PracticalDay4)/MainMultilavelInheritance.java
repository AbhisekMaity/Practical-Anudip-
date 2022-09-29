
//Example of Multilevel inheritance 
package Practical;
class Vehicle1{  // parent class 
	void running() {
		System.out.println("running mode on");
	}
}
class Bike1 extends Vehicle1{  // child class 
	void run() {
		System.out.println("Bike run mode on ");
	}
}
class Car extends Bike1{
	void speed() {
		System.out.println("The car speed is very high ");
	}
}
public class MainMultilavelInheritance {
public static void main(String[] args) {
	Car obj = new Car();  // object of child class method 
	obj.run();  // child class method method 
	obj.running(); // parent class method 
	obj.speed();
}
}

