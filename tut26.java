class Employee{
    int id ;
    String name;
    public void printDetails(){
        System.out.println("My name is: "+name);
        System.out.println("My id is: "+ id);
        System.out.println("");
    };
};
class Customcls {
    public static void main(String []args){
        Employee Dushyant = new Employee();
        Employee sudhir = new Employee();
        Employee jay = new Employee();

        Dushyant.name = " Dushyant Patidar";
        Dushyant.id = 262;

        sudhir.name = "Sudhir";
        sudhir.id = 252;

        jay.name = "Jay Patel";
        jay.id = 197 ;

        Dushyant.printDetails();
        sudhir.printDetails();
        jay.printDetails();
        //System.out.println(my.name);
    };
};