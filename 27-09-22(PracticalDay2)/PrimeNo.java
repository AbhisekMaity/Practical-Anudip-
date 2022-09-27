package Practical;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		int num,i,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		num=sc.nextInt();
		for(i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
			
		}
		if(count==0) {
			System.out.println("\n it is a prime number.");
		}
		else {
			System.out.println("\n it is not a prime number.");

		}
	}

}
