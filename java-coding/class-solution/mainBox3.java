class box{
    int l, b, h;
    int volume(){
        return l*b*h;
    }
}

class mainBox3 {
    public static void main(String arg[]){
        box b1 = new box();
        box b2 = new box();
        box b3;

        b1.l=10;
        b1.b=10;
        b1.h=10;

        b2.l=20;
        b2.b=20;
        b2.h=20;

        b3=b1;
        b3=b2;

        System.out.println(b1.volume());
        System.out.println(b2.volume());
        System.out.println(b3.volume());
    }
}
