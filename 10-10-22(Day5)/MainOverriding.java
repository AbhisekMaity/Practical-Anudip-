package Practical;

class TestOverrding{
	void run() {
		System.out.println("running mode on");
	}
}

 class MainOverriding extends TestOverrding {
	void run() {
//		 super.run();

		System.out.println("running mode off");
	}
	public static void main(String[] args) {
		MainOverriding obj = new MainOverriding();
		obj.run();
	}
}
