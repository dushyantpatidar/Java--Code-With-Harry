class c1{
    int z = 6 ;
    public int a = 5;
    private int b = 45 ;
    protected int c = 78 ;
    public void methodd(){
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
class tut42{
    public static void main(String[]args){
        c1 c = new c1();
        c.methodd();
        System.out.println(".........................");
        System.out.println(c.a);
       // System.out.println(c.b); // not allow , make a error , because we decalre as a private
        System.out.println(c.c);
        System.out.println(c.z);
    }
}