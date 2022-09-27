package Practical;

//public class DefaultConstructor {
//  int age;  // instance variable default value is zero
//  String name;  // instance variable default value is null
//  void show() {
//	  System.out.println(age+ "" +name);
//	  
//  }
//  public static void main(String[] args) {
//	DefaultConstructor obj1=new DefaultConstructor();
//	obj1.show();
//}
//}

public class DefaultConstructor {
	  int age;  // instance variable default value is zero
	  String name;  // instance variable default value is null
	  DefaultConstructor() {
		  System.out.println("Default constructor no need to called ");
		  System.out.println(age+ "" +name);
		  
	  }
	  public static void main(String[] args) {
		DefaultConstructor obj1=new DefaultConstructor();
		
	}
	}



