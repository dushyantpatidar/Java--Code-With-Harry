import java.util.Scanner;

class ladders {
    public static void main (String [] args) {
        // if , else if , else ladder / nested ....
    

        int age ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        age = sc.nextInt();
        if(age>60){
            System.out.println("You are Experienced");
        }
        else if(age>45){
            System.out.println("You are semi-Experienced");
        }
        else if(age>30){
            System.out.println("You are semi-semi-Experienced");
        }
        else{
            System.out.println("You are Not Experirnced");
        }

    }
};
