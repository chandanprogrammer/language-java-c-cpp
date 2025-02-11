class box{
    double l, b, h;
    void volume(){
        System.out.println("Volume = " + l*b*h);
    }
}

public class mainBox {
    public static void main(String arg[]){
        box b1 = new box();
        box b2 ;
        b2=b1;
        // b2 = null;
        b1.l = 12;
        b1.b = 6;
        b1.h = 3;
        b1 = null;
        // b1.volume();
        b2.volume();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b2==b1);
    }
}
