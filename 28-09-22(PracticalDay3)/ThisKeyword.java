
package Practical;

public class ThisKeyword {
  int rollno;
  String name;
  float fee;
  static String college ="SRM";
  ThisKeyword(int rollno,String name,float fee){
	  this.rollno=rollno;
	  this.name=name;
	  this.fee=fee;
//	  rollno=rollno;
//	  name=name;
//	  fee=fee;
	  // with out this the output will be default value 
  }
  // method for displaying the information 
   void display() {
	   System.out.println(rollno+ " " +name+ " " +fee+ " " +college);
   }
   // now class inside a class 
   
   public class Test{
	   public static void main(String[] args) {
		   ThisKeyword s1=new ThisKeyword(111,"Devid",50000);
		   ThisKeyword s2=new ThisKeyword(222,"Binod",80000);
s1.display();
s2.display();
	   }
   }
}
