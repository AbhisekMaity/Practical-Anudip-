package Practical;
/*Q.2... Write a java class to develop an employee class object & 
initialized the emp name & emp Id for 5 Emp. now write another 
class having name and from this class you have to create 5 employee 
objects but you are not allowed to use new keyword.*/
// create object without new keyword
class AnotherClass{
	String name;
	int id;
}
public class WithoutNew { 
	public static void main(String[] args) {
		try {  // creating object using newInstance method 
			AnotherClass o1 = AnotherClass.class.newInstance();
			AnotherClass o2 = AnotherClass.class.newInstance();
			AnotherClass o3 = AnotherClass.class.newInstance();
			AnotherClass o4 = AnotherClass.class.newInstance();
			AnotherClass o5 = AnotherClass.class.newInstance();
			o1.name="Abhisek";
			o1.id=10;
			o2.name="Aniket";
			o2.id=20;
			o3.name="Devid";
			o3.id=30;
			o4.name="Vinod";
			o4.id=40;
			o5.name="Devil";
			o5.id=50;
			System.out.println("Name: "+o1.name+" ID: "+o1.id);
			System.out.println("Name: "+o2.name+" ID: "+o2.id);
			System.out.println("Name: "+o3.name+" ID: "+o3.id);
			System.out.println("Name: "+o4.name+" ID: "+o4.id);
			System.out.println("Name: "+o5.name+" ID: "+o5.id);

		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
