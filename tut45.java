class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    };
    public void run(){
        int i = 0;
        while(i<50){
            System.out.println("I am a thread ");
            i++;
        }
    }
}
class tut45{
    public static void main(String[]args){
        MyThr m1 = new MyThr("Dushyant");
        MyThr m2 = new MyThr("Vishal");
        
        m1.start();
        m2.start();

        System.out.println("The id of thread of "+m1.getId());
        System.out.println("The Name of thread of "+m1.getName());

        System.out.println("The id of thread of "+m2.getId());
        System.out.println("The Name of thread of "+m2.getName());
    }
}