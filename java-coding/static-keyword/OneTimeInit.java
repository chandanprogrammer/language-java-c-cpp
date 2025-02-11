// Static variable allow one time inilization.

class Number {
    int next = 10; // heap memory
    static int count = 0; // class level memory

    void upadteNext() {
        next++;
        System.out.println(next);
    }

    void upadteCount() {
        count++;
        System.out.println(count);
    }
    // void upadteCount() {
    //     // System.out.println(count++);
    //     System.out.println(++count);
    // }
}

class OneTimeInit {
    public static void main(String arg[]) {
        Number n1 = new Number();
        Number n2 = new Number();
        Number n3 = new Number();

        n1.upadteNext(); // 11
        n2.upadteNext(); // 11
        n3.upadteNext(); // 11

        n1.upadteCount(); // 1
        n2.upadteCount(); // 2
        n3.upadteCount(); // 3
    }
}
