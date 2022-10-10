package Practical;


// Area of a circle 
// Aggregation has a relationship 
// we have created the reference entity of aggregation 
public class Circle {  // class 2
   double pi=3.14;
   double Area(int radious) {
	   Aggregation ag = new Aggregation();   // here we create object entity reference 

	   int psqure=ag.Squre(radious);
	   return pi*psqure;
   }
   public static void main(String[] args) {
	Circle c = new Circle();
	double result=c.Area(5);   
	System.out.println(result);
}
}
