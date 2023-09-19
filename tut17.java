import java.util.Scanner; 
class tut17 {
    public static void main(String []args){
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        //for(int i = 1 ; i<=n ; i ++ ){
        //    System.out.println(i);
        //}
        // n2 = Even numbers = 0,2,4,6,8,10
        // n2+1 = Odd numbers = 1,3,5,7,9,11

        for(int i = 1 ; i!=n ; i-- ){
            System.out.println(i);
        }
    }
}
