class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Seetha Thread");  // Corrected typo: Seetha Thread
            try {
                Thread.sleep(2000);  // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();  // Handle exception properly
            }
        }
    }
}

class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join();  // Uncomment this line to wait for MyThread to finish before proceeding

        for (int i = 0; i < 3; i++) {
            System.out.println("Rama Thread");
        }
    }
}
