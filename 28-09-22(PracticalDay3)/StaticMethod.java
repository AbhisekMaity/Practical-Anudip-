
package Practical;

public class StaticMethod {
  int rollno;
  String name;
  float fee;
  static String college ="SRM";
  static void change() {
	  college="HIT";
  }
  StaticMethod(int rollno,String name,float fee){
	  this.rollno=rollno;
	  this.name=name;
	  this.fee=fee;
  }
  // method for displaying the information 
   void display() {
	   System.out.println(rollno+ " " +name+ " " +fee+ " " +college);
   }
   // now class inside a class 
   
   class StaticMethod1{
	   public static void main(String[] args) {
		   StaticMethod s1=new StaticMethod(111,"Devid",50000);
		   StaticMethod s2=new StaticMethod(222,"Binod",80000);
		   StaticMethod.change();
s1.display();
s2.display();
	   }
   }
}

