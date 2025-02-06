package oops2.AccessModifiers;

import oops.LearnStaticKeyword;
import oops2.AccessModifiers2.University;

public class Student extends College {
    public static void main(String[] args) {
        University u1 = new University();
//        u1.universityName = "abc";
        System.out.println(u1.universityName);
        System.out.println(LearnStaticKeyword.collegeName); // access through class, without crate object access
    }
}
