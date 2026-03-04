import java.util.Scanner;

class ClassTest{
    public static void main(String[] args){
        System.out.println("Enter a for numerical patter and b for String Pattern: ");
        Scanner sc = new Scanner(System.in);

        String choice = sc.nextLine();
        sc.close();

        switch (choice){
            case "a":
                int n = 6;
                while(n>0){
                    for (int i = n; i>0; i--){
                        System.out.print(n);
                    }
                    System.out.println("");
                    n--;
                }
                break;
            case "b":
                String word = "HELLO";
                int len = word.length();

                for (int i = 0; i < len; i++){
                    for (int j = 0; j < (len - i); j++){
                        System.out.print(word.charAt(j));
                        

                    }
                    System.out.println("");
                }
                break;
            default:
                System.out.println("Invalid Input");


        }
    }
}

