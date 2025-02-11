// Write a program in java to calculate volume of cylinder using class & object.

class cylinder{
    int l, b, h;
    void volume(){
        System.out.println("Volume of cylinder is " + (l*b*h));
    }
}

class VolumeOfCylinder {
    public static void main(String arg[]) {
        cylinder a1 = new cylinder();
        a1.l = 12;
        a1.b = 6;
        a1.h = 2;
        a1.volume();
    }
}
