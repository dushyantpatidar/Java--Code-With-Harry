import java.util.Scanner;
class tut49{
    public static void main(String[]args){
        int [] marks = new int[3];
        marks[0] = 23;
        marks[1] = 12 ;
        marks[2] = 33 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Index : ");
        int ind =  sc.nextInt();

        System.out.println("Enter the number you want to divide with : ");
        int number =  sc.nextInt();
        try{
            System.out.println("The value at array index entered is:\n "+marks[ind]);
            System.out.println("The Value of array value div by number is "+marks[ind]/number);
        }
        //catch(Exception a ){
        //    System.out.println("Some Exception is occured ");
        //    System.out.println(a);
        //}
        catch(ArithmeticException b ){
            System.out.println("ArithmeticException Exception is occured ");

        }
        catch(ArrayIndexOutOfBoundsException c ){
            System.out.println("ArrayIndexOutOfBoundsException Exception is occured ");

        }
    }
}