class Student{
    int rollno;
    String name;
    float fee;
    Student(int rollno,String name,float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    void display(){System.out.println(rollno+ " " + name+ " "+fee);}
}
class this_keyword{
    public static void main(String args[]){
        Student s1 = new Student(111, "Devraj", 10000);
        s1.display();

    }
}