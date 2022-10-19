package Practical;



//Exapmle of interface 
interface Test1 { // interface
	void show(); // method of interface
}

class Demo1 implements Test1 { // 1st child class
	public void show() { // method of calss
		System.out.println("Hello my future employee");
	}
}

class Demo implements Test1 { // 2nd child class
	public void show() { // method of calss
		System.out.println("Welcome to the company");
	}

	public static void main(String[] args) { // main method
		Test1 obj = new Demo(); // creating the object
		obj.show(); // calling the method
	}
}
