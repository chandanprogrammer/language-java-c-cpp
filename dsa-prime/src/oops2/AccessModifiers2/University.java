package oops2.AccessModifiers2;

public class University {
    public String universityName = "Magadh University";
    private int universityLoginID = 12345;
    protected int registrationNo;

    public static void main(String[] args) {
        University u2 = new University();
        System.out.println(u2.universityName);
        System.out.println(u2.universityLoginID);
        System.out.println(u2.registrationNo);
    }
}
