class Teacher {
    int id;
    String name;
    static String department  = "CSIT";
    Teacher(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id + " " + name + " " + department);
    }
}
