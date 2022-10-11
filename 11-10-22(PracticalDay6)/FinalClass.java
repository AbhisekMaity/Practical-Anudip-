package Practical;
// we cannot extends final class 
final class FinalClass {
  
}
class Test extends FinalClass{  // we cannot do it 
	void show() {
		System.out.println("Hell world");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.show();
	}
}
