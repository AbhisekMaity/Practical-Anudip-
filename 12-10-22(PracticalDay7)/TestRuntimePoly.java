package Practical;
// run time polymorphism  -- method overriding 
//(when the program will run then which method will show)
class RuntimePoly {
	int value=50;
 void show() {
	 System.out.println("show anything");
 }
}
class TestRuntimePoly extends RuntimePoly{
	int value=70;
	int value1=89;
	void show() {
		System.out.println("show nothing");
	}
	public static void main(String[] args) {
		RuntimePoly obj = new TestRuntimePoly();
		obj.show();
		System.out.println(obj.value);
//		System.out.println(obj.value1);  
//		it will be showing error 
 
	}
}
