package Practical;

public class StaticVariable1 {
  int rollno;
  String name;
  float fee;
  static String college ="SRM";
  StaticVariable1(int rollno,String name,float fee){
	  this.rollno=rollno;
	  this.name=name;
	  this.fee=fee;
  }
  // method for displaying the information 
   void display() {
	   System.out.println(rollno+ " " +name+ " " +fee+ " " +college);
   }
   // now class inside a class 
   
   public class StaticVariable{
	   public static void main(String[] args) {
		   StaticVariable1 s1=new StaticVariable1(111,"Devid",50000);
		   StaticVariable1 s2=new StaticVariable1(222,"Binod",80000);
s1.display();
s2.display();
	   }
   }
}
