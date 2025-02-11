class MyThread extends Thread {
    
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class ThreadNameExample {
    public static void main(String[] args) {
        
        MyThread thread = new MyThread();
        System.out.println("Thread old name: " + thread.getName());
        thread.start(); 
        thread.setName("Renamed-Thread-1");
        System.out.println("Thread new name: " + thread.getName());
    }
}
