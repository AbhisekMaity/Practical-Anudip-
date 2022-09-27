package Practical;

public class ParameterizeConstructor {
	int age;
	String name;
	ParameterizeConstructor(int a,String n){
		age=a;
		name=n;
		System.out.println("This is ParameterizeConstructor");
	}
	public void show() {
		System.out.println(age+ " " + name);
		
	} 
	public static void main(String[] args) {
		ParameterizeConstructor obj=new ParameterizeConstructor(22,"Ronit");
		ParameterizeConstructor obj1=new ParameterizeConstructor(28,"Amit");

		obj.show();
		obj1.show();
	}
}
