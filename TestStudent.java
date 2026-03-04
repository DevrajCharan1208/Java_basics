 class Student{
            int id;
            String name;
        }

public class TestStudent{
    public static void main (String args[]){
       Student s1 = new Student();
       s1.id = 101;
       s1.name = "Devraj";
       System.out.println(s1.id + " name " + s1.name);
        }
    }