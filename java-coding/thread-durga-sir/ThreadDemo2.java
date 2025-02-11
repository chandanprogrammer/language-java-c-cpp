class MyThread extends Thread {
    public void start() {
        super.start();
        for(int i=0; i<3; i++){
            System.out.println("start method");
        }
    }

    public void run() {
        System.out.println("run method");
    }
}

class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        t.start();
        System.out.println("main method");
    }
}
