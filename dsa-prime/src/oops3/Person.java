package oops3;

public class Person {
    private int age;
    private String name = "Chandan";
    boolean canBeChange = true;
    boolean canBeAccessed = true;
    public void setAge(int age){
        if(canBeChange){
            if(age > 0){
                this.age = age;
            }
        }
    }
    public int getAge(){
        if(canBeAccessed) return  age;
        return -1;
    }
}
