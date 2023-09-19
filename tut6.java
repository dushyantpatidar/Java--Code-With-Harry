import java.util.Scanner;

class test {
    public static void main(String args[]){
        float sub1 , sub2, sub3, sub4 , sub5;
        float total , avg , pre;

        Scanner sc = new Scanner(System.in);
        System.out.println("Subject Marks");
        System.out.println("Enter Marks sub1");
        sub1 = sc.nextFloat();
        System.out.println("Enter Marks sub2");
        sub2 = sc.nextFloat();
        System.out.println("Enter Marks sub3");
        sub3 = sc.nextFloat();
        System.out.println("Enter Marks sub4");
        sub4 = sc.nextFloat();
        System.out.println("Enter Marks sub5");
        sub5 = sc.nextFloat();

        // Total , avg , pre -----
        total = sub1 + sub2 + sub3 + sub4 + sub5 ;
        avg = (total/ 5);
        pre = (total/ 500 ) * 100;

        System.out.print("Total Marks: ");
        System.out.println(total);

        System.out.print("Total avg: ");
        System.out.println(avg);

        System.out.print("Total pre: ");
        System.out.println(pre);

    };
};