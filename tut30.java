class base{
    public base(){
        System.out.println("I am Base Class");
    }
    public base(int a ){
        System.out.println("I am Base Class with argumnet "+a);
    }

};
class derived extends base {
    public derived(){
        //super(55);
        System.out.println("I am Derived Class");
    }

    public derived( int a , int b ){
        super(a);
        System.out.println("I am Derived Class Constructors Overloaded with value of a as: "+a);
    }
};
class ChildOfDerived extends derived{
    ChildOfDerived(){
        System.out.println("I am a ChildOfDerived ");
    }
    ChildOfDerived(int x , int y , int z ){
        super(x ,y);
        System.out.println("I am a Overloaded Constructor of ChildOfDerived class or  x is : "+x);
    }
}
class tut30{
    public static void main(String[]args){
        //base my = new base() ;
        //base my = new base(55) ;
        //derived my1 = new derived();
        derived my2 = new derived(4 , 9 );
        //ChildOfDerived my3 = new ChildOfDerived();
        //ChildOfDerived my4 = new ChildOfDerived(5 , 7 , 9 );
    }
}