//Example of Multilevel inheritance 

package Practical;
class Vehicle2{  // parent class 
	void running() {
		System.out.println("running mode on");
	}
}
class Bike2 extends Vehicle1{  // child class 
	void run() {
		System.out.println("Bike run mode on ");
	}
}
class Car2 extends Vehicle2{
	void speed() {
		System.out.println("The car speed is very high ");
	}
}
public class MainHirerarchicalInheritance {
public static void main(String[] args) {
	Bike2 bike = new Bike2();  // object of child class method 
	bike.run();  // child class method method 
	bike.running();  // parent class method 
	 Car2 car = new Car2();
	 car.speed();
	 car.running();
}
}


