class Student{
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno = r;
        name = n;
    }
    void displayinformation(){System.out.println(rollno+" "+name);}
}

public class TestStudent4{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecord(111,"Devraj");
        s2.insertRecord(222,"Kajaliyo Don");
        s1.displayinformation();
        s2.displayinformation();
    }
}