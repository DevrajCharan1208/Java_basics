class Adder
{
    static int add(int a , int b)
    {
        return a+b;
    }
    static int add(int a, int b, int c)
    {
        return a+b+c;
    }
}

class Method_Overloading{
    public static void main(String[] args) {
        Adder a = new Adder();
        System.err.println(a.add(1,2));
        System.err.println(a.add(1,2,3));
    }
}