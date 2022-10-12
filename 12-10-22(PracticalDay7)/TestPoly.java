package Practical;
class Bank2{
	float rateOfInterest() {
		return 0;
	}
}
class Axis extends Bank2{
	float rateOfInterest() {
		return 2.3f;
	}
}
class Sbi extends Bank2{
	float rateOfInterest() {
		return 7.3f;
	}
}
class Icici extends Bank2{
	float rateOfInterest() {
		return 5.3f;
	}
}
public class TestPoly {
	public static void main(String[] args) {
		Bank2 obj;
		obj=new Axis();
		System.out.println("Axis "+obj.rateOfInterest());
		obj=new Sbi();
		System.out.println("Sbi "+obj.rateOfInterest());
		obj=new Icici();
		System.out.println("Icici "+obj.rateOfInterest());
	}

}
