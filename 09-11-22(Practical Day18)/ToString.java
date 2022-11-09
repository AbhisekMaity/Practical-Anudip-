package Practical;
// represent any object to string, we can return value of object instead of the object 
public class ToString {
	int rollno;
   String name,address;
   ToString(int rollno,String name,String address){
	   this.rollno=rollno;
	   this.name=name;
	   this.address=address;
   }
   public String toString() {  // return object into string 
	   return rollno+" "+ name +" "+" "+address;
    }
   public static void main(String[] args) {
	ToString s1=new ToString(123,"Abhisek","Tamluk");
	ToString s2 = new ToString(124,"Amit","Panskura");
	System.out.println(s1);
	System.out.println(s2);

}
}
