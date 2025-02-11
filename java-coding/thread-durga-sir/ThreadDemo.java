class myThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child-thread  ");
        }
    }
}

class ThreadDemo {
    public static void main(String ar[]) {
        myThread t = new myThread(); // Instantiation of a Thread
        // t.start(); // Starting a Thread
        t.run();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main-thread  ");
        }
    }
}