package Practical;

class A{
	int num;
	boolean valueSet=false;
	public synchronized void put(int num) {
		while (valueSet) {
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("Value in side the put method "+num);
		this.num=num;
		valueSet=true;
		notify();
		}
	public synchronized void get() {
		while (!valueSet) {
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("Value inside the get method "+num);
		valueSet=false;
		notify();
		}
}
class Producer implements Runnable{
	A a;
	Producer(A a){
		this.a=a;
		Thread t1 = new Thread(this,"Produceer");
		t1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true) {
			a.put(i++);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		}
	}
}

class Cousumer implements Runnable{
	A a;
	Cousumer(A a){
		this.a=a;
		Thread t1 = new Thread(this,"Cousumer");
		t1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true) {
			a.get();
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		}
	}
}
public class MainInnerThreadComminucation {
	public static void main(String[] args) {
   A a = new A();
   new Producer(a);
   new Cousumer(a);
   }
}
