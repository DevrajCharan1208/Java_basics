class Student4{
    int rollno;
    String name;
    void Student4(int r, String n){
        rollno = r;
        name = n;
    }
    void displayinformation(){System.out.println(rollno+" "+name);}
}

public class TestStudent4{
    public static void main(String args[]){
        Student s1 = new Student4();
        Student s2 = new Student4();
        s1.displayinformation();
        s2.displayinformation();
    }
}