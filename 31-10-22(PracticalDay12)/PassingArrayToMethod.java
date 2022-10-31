package Practical;

public class PassingArrayToMethod {
	static void maxVal(int array[]) {  // creating a method which 
		// pass an array as a parameter 
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(max < array[i]) {
				max=array[i];
			}
		}
		System.out.println("The maximum value of an array  is "+max);
		
	}
	
    public static void main(String[] args) {
		int arr[]= {12,-90,56,34,78};  // dec and inc an array 
		maxVal(arr);  // pass an array to method maxVal 
	}
}
