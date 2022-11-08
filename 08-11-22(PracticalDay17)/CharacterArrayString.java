package Practical;

public class CharacterArrayString {
  public void show() {
	  char [] arr= {'j','a','v','a'}; // char type array 
	  String s =  new String(arr);
	  System.out.println("Value is : " +s);
	  System.out.println(arr);
	  
  }
  public void myFunction() {
	  String m1 = "pallabi";
	   String m2=new String(m1);
	   System.out.println(m2);
	   
	   System.out.println("The character is "+m1.charAt(3));
	   System.out.println("The character is "+m1.charAt(0));
  }
  public static void main(String[] args) {
	  CharacterArrayString obj  = new CharacterArrayString();
	  obj.show();
	  obj.myFunction();
}
}
