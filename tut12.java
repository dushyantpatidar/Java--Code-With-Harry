import java.util.Scanner;
class tfconditions {
    public static void main(String[] args){

        System.out.println("For Logical AND...");
        boolean a = false;
        boolean b = true;
        if( a && b){ // Jab dono true hogi tak hi true hoga 
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        System.out.println("                       ");
        
        
        System.out.println("For Logical OR...");
        boolean a1 = false;
        boolean b2 = true;
        if( a1 || b2){ // Jab ek true hoga tab true ho jaega
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        System.out.println("                       ");
        
        
        System.out.println("For Logical NOT...");
        boolean m = false;
        boolean n = true;
        System.out.print("Not(a) is ");
        System.out.println(m);
        System.out.println("");
        System.out.print("Not(b) is ");
        System.out.println(!n);
    }
}
