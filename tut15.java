import java.util.Scanner;
// while loop
class lOOp{
    public static void main(String[]args){
        int n ;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        n = sc.nextInt();
        while(i<=n){
            System.out.println("While Loop: "+i*3);
            i++;
        };
        while (true){
            //System.out.println("This is infinate while loop ");
        };
    };
};
