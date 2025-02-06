package basics;

public class Operators {
    public static void main(String[] args) {

        // Arithmetic operators....
        System.out.println(15 + 7);
        System.out.println(15 - 7);
        System.out.println(15 * 7);
        System.out.println(15 / 7);
        System.out.println(15 % 7);

        // Assignment operators....
        int age = 12;
        System.out.println(age += 2); // age = age + 2
        System.out.println(age -= 2); // age = age - 2
        System.out.println(age *= 2); // age = age * 2
        System.out.println(age /= 2); // age = age / 2
        System.out.println(age %= 2); // age = age % 2

        // Relational operators....
        int a = 5, b = 4;
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b);  // true
        System.out.println(a >= b); // true
        System.out.println(a < b);  // false
        System.out.println(a <= b); // false


        // Logical operators....
        System.out.println(a>b && b==4); // true
        System.out.println(a>b || b==4); // true
        System.out.println(!(a>b));      // false

        // Bitwise operators....
        // ~ , << , >> , >>> , & , ^

        // Increment or Decrement operators
        int marks = 95;
        marks++; // Increment by 1
        System.out.println(marks); // 96
        marks--; // Decrement by 1
        System.out.println(marks); // 95

        // Ternary Operators....
        int max = (a > b) ? a : b;
        System.out.println("Max number : " + max);
    }
}
