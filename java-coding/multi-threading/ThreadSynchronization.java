class Table{
    void printt(int n){
        for(int i=0; i<5; i++){
            System.out.println(i*n);
        }
    }
}
class thread1 extends Thread{
    Table t;
    thread1(Table t){
        this.t = t;
    }
    public void run(){
        t.printt(5);
    }
}
class thread2 extends Thread{
    Table t;
    thread2(Table t){
        this.t = t;
    }
    public void run(){
        t.printt(50);
    }
}

class ThreadSynchronization {
    public static void main(String[] args) {
        Table t = new Table();
        thread1 t1 = new thread1(t);
        thread2 t2 = new thread2(t);
        t1.start();
        t2.start();
    }
}
