// Write a program in java to show method overloading.

class MethodOverload {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String arg[]) {
        MethodOverload ref = new MethodOverload();
        System.out.println(ref.add(2, 7));
        System.out.println(ref.add(22.6, 7));
        System.out.println(ref.add(3, 7, 2));
        System.out.println(add(3.7, 7.4, 2.2));
    }
}
