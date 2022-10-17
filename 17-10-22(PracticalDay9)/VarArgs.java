package Practical;

public class VarArgs {
  public void myMethod(String...text) {
	  System.out.println("Hello Abhisek this is"
	  		+ " a method here we use"
	  		+ " variable argument ");
	  for(String str:text) {
		  System.out.println(str);
	  }
	  
  }
  public static void main(String[] args) {
	  VarArgs obj =  new VarArgs();
	obj.myMethod(); //  zero argument no problem run successfully 
//	System.out.println("The texts are : ");
	obj.myMethod("Devid","Abhisek","Devil");
//	System.out.println("The texts are : ");

	obj.myMethod("Devid","Abhisek","Devil","Binod","Prithula","Nila","Sayani","Ronita");  // that means we assign any no of argument 
  }
}
