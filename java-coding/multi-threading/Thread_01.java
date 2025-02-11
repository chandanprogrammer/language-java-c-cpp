class MyThread1 extends Thread {
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println("Child Thread 1");
		}
	}
}

class MyThread2 extends Thread {
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println("Child Thread 2");
		}

	}
}

class Thread_01 {
	public static void main(String arg[]) {
		MyThread1 ref1 = new MyThread1();
		MyThread2 ref2 = new MyThread2();
		ref1.start();
		ref2.start();
		for(int i=0; i<10; i++){
			System.out.println("Main Thread");
		}
	}
}