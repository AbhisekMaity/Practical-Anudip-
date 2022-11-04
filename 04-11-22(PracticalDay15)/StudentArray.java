package Practical;
class StudentArray{
	// declaring instance variable 
	int studentNo;
	String Name,Mail,Address;
	double fees;
	// static member for increase Fees method 
	static double increasedFees;
	
	// creating constructor for accessing the details of student
	// passing value through overloaded constructor 
	StudentArray(int sn,String name,String mail,String address){
		this.studentNo=sn;
		this.Name=name;
		this.Mail=mail;
		this.Address=address;
		
	
		
	}
	// method for initializing fees to student
	void fees(double fee) {
		fees=fee;// assigning passing value
	}
	// method for printing output 
	void display() {  
		this.fees=this.fees+increasedFees;
		// for concatenation and sop the output
		System.out.println("ID- "+this.studentNo+ " Name- "+this.Name+ " Mail-  "+this.Mail+ " Address- "+this.Address+" Fees- "+this.fees);
		
	}
	static void  increaseFees(int No,double fee ) {
		if(fee<2000) {
			fee=10*fee/100;
			increasedFees=fee;
		}
		
	}



//public class MainStudentArray {
    public static void main(String[] args) {
		// Instantiating student type of array and declaring 
         StudentArray[] student=new StudentArray[5];	
         student[0]=new StudentArray(100,"Abhisek","abc@gmail.com","Tamluk");
         student[1]=new StudentArray(101,"Devid","dvd@gmail.com","Kolkata");
         student[2]=new StudentArray(102,"Ronit","rnt@gmail.com","Mumbai");
         student[3]=new StudentArray(103,"Sayani","say@gmail.com","Delhi");
         student[4]=new StudentArray(104,"Sayantika","stk@gmail.com","Orisha");
    // now we adding fees here 
         student[0].fees(1064);
         student[1].fees(1500);

         student[2].fees(1700);

         student[3].fees(2000);

         student[4].fees(5000);
         
         // increasing fees whose fees is less than 2000
         
         increaseFees(100,1064);
         increaseFees(101,1500);
         increaseFees(102,1700);
      student[0].display();
      student[1].display();

      student[2].display();

      student[3].display();

      student[4].display();

      
         

        }
    }

    
//}
