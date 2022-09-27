package Practical;

public class Pattern {
   public static void printTriangle(int n) {
	   //outer loop to handle the no. of rows , n in this
	   for(int i=0;i<n;i++) {
		   // this loop handle the no of spaces 
		   for(int j=n-i;j>1;j--) {
			 System.out.print(" ");
		   }
		   // this loop handle the no of stars
		   for(int j=0;j<i;j++) {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
   }
    public static void main(String[] args) {
		int n=5;
		printTriangle(n);
	}
}
