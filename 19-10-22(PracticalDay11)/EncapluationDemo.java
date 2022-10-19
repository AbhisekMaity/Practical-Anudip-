package Practical;

public class EncapluationDemo {
  private String Student_name;
  private int Studentuser_id;
  private int password;
  int total,percentage;
public String getStudent_name() {
	return Student_name;
}
public void setStudent_name(String student_name) {
	Student_name = student_name;
}
public int getStudentuser_id() {
	return Studentuser_id;
}
public void setStudentuser_id(int studentuser_id) {
	Studentuser_id = studentuser_id;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public int getPercentage() {
	return percentage;
}
public void setPercentage(int percentage) {
	this.percentage = percentage;
}
public void calc(int sub1,int sub2,int sub3,int sub4,int sub5) {
total=sub1+sub2+sub3+sub4+sub5;
percentage=total/5;
if(percentage>=35 && percentage<=45) {
	System.out.println("D grade");
}
else if(percentage>=45 && percentage<=55) {
	System.out.println("C grade");
}
else if(percentage>=55 && percentage<=75) {
	System.out.println("B grade");
}
else if(percentage>=75 && percentage<=85) {
	System.out.println("A grade");
}
else if(percentage>=85 && percentage<=100) {
	System.out.println("O grade");
}
else {
	System.out.println("Failed");
}
}
}


