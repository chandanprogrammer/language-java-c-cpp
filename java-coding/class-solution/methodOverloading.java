class box{
    void volume(int l, int b, int h){
        System.out.println(l*b*h);
    }
    void volume(int l, int b){
        System.out.println(l*b);
    }
    void volume(int l, double b){
        System.out.println(l*b);
    }
    void volume(double l, double b, double h){
        System.out.println(l*b*h);
    }


}


class methodOverloading {
    public static void main(String[] args) {
        box x1 = new box();

        x1.volume(20, 10, 5);
        x1.volume(20.5, 10.5, 5.3);
    }
}
