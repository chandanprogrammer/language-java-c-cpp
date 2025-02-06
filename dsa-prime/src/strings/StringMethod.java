package strings;

public class StringMethod {
    public static void main(String[] args) {

        String subject = "Physics";
        System.out.println(subject.length()); // find length of string

        System.out.println(subject.toUpperCase());
        System.out.println(subject.toLowerCase());

        String words = "  I love Java, and Java is my favorite language.   ";
        System.out.println(words);
        System.out.println(words.trim());
        System.out.println(words.replace("Java", "cpp"));
        System.out.println(words.contains("java")); // false
        System.out.println(words.contains("Java")); // true

        String name = "Chandan";
        System.out.println(name.startsWith("Cha")); // true
        System.out.println(name.endsWith("dan")); // true
        System.out.println(name.charAt(4)); // d
        System.out.println(name.substring(2, 5)); // [2-5)
        System.out.println(name.substring(2)); // [2-last]
        System.out.println(name.concat(words));



        String[] word1 = words.split(" "); // split return array

        for(String word : word1) System.out.println(word); // print split return array

        int age = 22;
        String newAge = String.valueOf(age); // convert in string
        System.out.println(newAge);

        String color = "Pink";
        char[] letters = color.toCharArray(); // to store character in array
        for(char letter : letters)
            System.out.print((letter + " ").toUpperCase()); // print character

        System.out.println();

        String animal =" ";
        if(animal.isEmpty()) System.out.println("Empty"); // space include
        if(animal.isBlank()) System.out.println("Blank"); // space not include

    }
}
