import java.util.Scanner;
class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("This is 18+");
        }
        else{
            System.out.println("This is Child");
        }

        // == Equal 
        // <= Greater then equal to 
        // != Not equal

    }
};
