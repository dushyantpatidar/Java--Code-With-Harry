interface SamPle{
    void meth1();
    void meth2();
}

interface ChildSamPle extends SamPle{ // inheritance in interfaces used like that 
    void meth3();
    void meth4();
}
//class ChildSamPle extends SamPle{ // ---> wrong way to define a inheritace in interface
//    void meth3();
//    void meth4();
//}

class MyChildSamPle implements ChildSamPle{

    public void meth1(){
        System.out.println("Method 1");
    };
    public void meth2(){
        System.out.println("Method 2");
    };
    public void meth3(){
        System.out.println("Method 3");
    };
    public void meth4(){
        System.out.println("Method 4");
    };
    
}
class tut37{
    public static void main(String[]args){
        MyChildSamPle a = new MyChildSamPle();
        a.meth1();
        a.meth2();
        a.meth3();
        a.meth4();
    }
}