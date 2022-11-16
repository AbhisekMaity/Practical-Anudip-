package Practical;

public class CustomExceptionExp {
  public void checkAge(int age) throws InvalidAgeException{
	  if(age <= 18|| age >=25) {
		  throw new InvalidAgeException("Invalid age for enrolling java course");
		  
	  }
	  else {
		  System.out.println("Yes you can enrole the java course ");
	  }
	  
  }
  public static void main(String[] args) throws InvalidAgeException {
	  CustomExceptionExp obj = new CustomExceptionExp();
	  obj.checkAge(17);
}
}
