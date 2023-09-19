import java.util.Scanner;
class mThdFuction {

    //static void logic(int x, int y){   without Object  and return type  
    //static int logic(int x, int y){   without Object 
    int logic(int x, int y){
        int z = x + y ;
        return z;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Number: ");
        int b = sc.nextInt();
        //int c = logic(a , b); Without Object 
        mThdFuction xee = new mThdFuction();
        int c = xee.logic(a, b);
        System.out.println("Sum is: "+c);
        
    }
}
