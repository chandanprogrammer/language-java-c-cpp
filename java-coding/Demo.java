class DA{
    DB obj;
    DA(DB d){
        System.out.println("d   : " + d);
        this.obj = d; // copy 'd' object in 'obj'
        d = null;
        System.out.println(d);

    }
    void msg(){
        // System.out.println("Hello ji");
        System.out.println("obj : " + obj);
    }
}
class DB{
    int data = 55;
    DB(){
        DA d1= new DA(this);
        System.out.println("d1  : "+ d1);
        d1.msg();
    }
}
class Demo{
    public static void main(String[] args) {
        DB ref = new DB();
        // System.out.println(ref.data);
    }
}