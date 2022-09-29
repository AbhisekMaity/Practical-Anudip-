// Example of single inheritance 
package Practical;
class Vehicle{  // parent class 
	void running() {
		System.out.println("running mode on");
	}
}
class Bike extends Vehicle{  // child class 
	void run() {
		System.out.println("Bike run mode on ");
	}
}
public class MainSingleInheritance {
  public static void main(String[] args) {
	Bike obj = new Bike();  // object of child class method 
	obj.run();  // child class method method 
	obj.running(); // parent class method 
}
}
