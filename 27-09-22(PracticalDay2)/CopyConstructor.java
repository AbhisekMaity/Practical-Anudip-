package Practical;

public class CopyConstructor {
	int age;
	String name;
	CopyConstructor(int a,String n){
		age=a;
		name=n;
	}
//	CopyConstructor(CopyConstructor c){
//		age=c.age;
//		name=c.name;
//	}
	CopyConstructor(){
		
	}
	public void show() {
		System.out.println("This is copy constructor");
		System.out.println(age+ " " +name);
	}
	public static void main(String[] args) {
		CopyConstructor obj1 = new CopyConstructor(23,"Suman");
		CopyConstructor obj2 = new CopyConstructor();
//		
//		obj2.age=obj1.age;
//		obj2.name=obj1.name;
		
		obj2.show();
		obj1.show();
		
		
	}
}
