package Practical;

public class StudentDetails {
	int id;
	String name;
	StudentAddress sa;
	public StudentDetails(int id,String name,StudentAddress sa) {
		this.id=id;
		this.name=name;
		this.sa=sa;
	}
	public void show() {
		System.out.println(id+" "+name);
		System.out.println(sa.area+" "+sa.city+" "+sa.dist);
	}
  public static void main(String[] args) {
	StudentAddress sa=new StudentAddress("uptoNH6","Medinipur","PaschimMedinipur");
	StudentDetails sd=new StudentDetails(101,"Abhisek",sa);
	sd.show();
}
}
