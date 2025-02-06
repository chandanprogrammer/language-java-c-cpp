package oops4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnPolymorphism {
    public static void main(String[] args) {
//        Data d;
//        d = new ChildData();
        Data d = new ChildData();
        d.printData(); // Runtime polymorphism as known as method overriding
        d.printData(6); // Compile-time polymorphism as known as method overloading

        List<Integer> l1 = new ArrayList<>(); // List parent of ArrayList and LinkedList
        List<Integer> l2 = new LinkedList<>();
    }
}

class Data{
    int data;
    public void printData(){
        System.out.println(data);
    }
    public void printData(int data){
        System.out.println("2nd Data pass value "+ data);
    }
}
class ChildData extends Data {
    @Override
    public void printData(){
        System.out.println("override " + data);
    }
}
