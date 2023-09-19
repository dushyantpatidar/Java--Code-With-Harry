//class Parent{
//    public Parent(){
//        System.out.println("I am a Constructr");
//    };
//    public void mtd(){
//        System.out.println("hello");
//    }
//    abstract public void SayHello(); // we make a abstract method
//}

abstract class Parent{ 
    public Parent(){
        System.out.println("I am a Constructr");
    };
    public void mtd(){
        System.out.println("hello");
    }
    abstract public void greet(); // we make a abstract method so the holl class convert into abstract class 
    abstract public void greet2();
};

class Childd extends Parent{ // Concret class 
    @Override
    public void greet(){
        System.out.println("Good morning...!");
    }

    @Override
    public void greet2(){
        System.out.println("Good Afternoon...!");
    }
};


abstract class Childd2 extends Parent{ // ya to abstract class ya overide krke extends kro 
    public void th(){
        System.out.println("I am Good ");
    }
}

class tut34{
    public static void main(String[]args){
        // Parent p = new Parent(); // Don't allow to make class bcz class is abstract 
        Childd c = new Childd();
        //Childd2 c = new Childd2(); // Don't allow / so throw an error 
    }
};