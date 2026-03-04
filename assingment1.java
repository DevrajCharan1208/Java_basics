import java.util.*;
class assingment1{
    public static void main(String[] args){
        int a = 0;
        int b = 1;

        System.out.print("Enter umber of terms: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(a);
        System.out.print(",");
        System.out.print(b);
        for (int i = 0; i<n; i++){
                int next = a+b;
                System.out.print(","+ next);

                a = b;
                b = next;
        }


    }
}