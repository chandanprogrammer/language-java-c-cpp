// write a program in java to show copy constructor (without passing object).

class player {
    String name;
    int age;

    player() {
    }

    player(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

class CopyConstructor2 {
    public static void main(String arg[]) {
        player p1 = new player("Aman", 29);
        player p2 = new player();
        p2.name = p1.name;
        p2.age = p1.age;
        p1.display();
        p2.display();
    }
}
