package Practical;

 class NormalClass {
//  void print(int num) {//without synchronization here we will get irregular output
	 synchronized void  print(int num) {//with synchronization here we will get regular output
	  for(int i=1;i<=5;i++) {  
		  try {
			  System.out.println(i*num);
			  Thread.sleep(500);
		  }
		 
	  catch(InterruptedException ie) {
		  System.out.println(ie);
	  }
    }
  }
}
class Thread1 extends Thread{
	NormalClass nc;
	Thread1(NormalClass nc){
		this.nc=nc;
	}
	@Override
	public void run() {
		nc.print(5);
	}
}
class Thread2 extends Thread{
	NormalClass nc;
	Thread2(NormalClass nc){
		this.nc=nc;
	}
	@Override
	public void run() {
		nc.print(50);
	}
}

class MainSynchronizationClass {
	public static void main(String[] args) throws InterruptedException {
		NormalClass nc=new NormalClass();
		Thread1 t1=new Thread1(nc);
		Thread2 t2=new Thread2(nc);
		t1.start();
//		t1.join();  // if we join method then also we will get the regular output 
		t2.start();
	}
}