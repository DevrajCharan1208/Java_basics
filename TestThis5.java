class A{
    A(){System.err.println("hello a");}
    A(int x){
        this();
        System.err.println(x);
    }
}
class TestThis5{
    public static void main(String[] args) {
        A a = new A(10);
    }
}