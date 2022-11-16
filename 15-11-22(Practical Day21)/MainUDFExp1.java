package Practical;

public class MainUDFExp1 {
  public static void main(String[] args) {
	try {
		throw new UserDefineException1("User defined exception");
	}
	catch(UserDefineException1 udf1){
		System.out.println("got exception");
		System.out.println(udf1.getMessage());
	}
}
}
