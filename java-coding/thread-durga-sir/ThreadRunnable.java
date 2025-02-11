class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child-thread");
        }
    }
}

class ThreadRunnable {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread();
        Thread t2 = new Thread(r);
        // t1.start();
        t1.run();
        for(int i=0; i<5; i++){
            System.out.println("Main-thread");
        }
    }
}
