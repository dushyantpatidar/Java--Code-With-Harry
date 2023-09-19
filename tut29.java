class papa{ // --------------Parent Class / Base Class 
    public int x ;

    public int getx(){
        System.out.println("This is papa: ");
        return x ;

    }
    public void setx(int x ){
        this.x = x ;
    };
};

class beta extends papa { //----------------Child Class / Derived Class 
// extends use for connect the class's

    public int y ;

    public int gety(){
        System.out.println("This is Beta: ");
        return y ;
    }
    public void sety(int y){
        this.y = y ;
    };
};
class tut29{
    public static void main(String[]args){
        papa my = new papa();
        my.setx(55);
        //my.sety(77)-------don't allow to call a parent class to child class
        System.out.println("Papaaaaa: "+my.getx()+"\n");

        beta my1 = new beta();
        my1.setx(77); // ----- Allow to call a child to  parent class
        my1.sety(99);
        System.out.println("Betaaaaa:"+my1.gety()+"\n");
        System.out.println("Papaaaa is calling : "+my1.gety());

    }
}