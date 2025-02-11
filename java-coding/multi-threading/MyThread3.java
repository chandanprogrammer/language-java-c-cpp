class myth extends Thread {

    myth() {
        System.out.println("defalut constructor.");
    }

    myth(String name) {
        System.out.println("parameterized constructor");
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
    }
}

class MyThread3 {
    public static void main(String arg[]) {
        myth th = new myth("first string");
        myth th1 = new myth();
        th.start();
        th1.start();
    }
}