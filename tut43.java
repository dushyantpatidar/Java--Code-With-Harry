// createing a thread 
class MyThread extends Thread{
    @Override
    public void run(){
        int i = 0 ;
        while(i<20){
            System.out.println("My Cooking Thread is Running ");
            System.out.println("I am Happy");
            i++;
        }
    };
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int j = 0 ;
        while(j<20){
            System.out.println("thread 2 for chatting with her ");
            System.out.println("I am Sad");
            j++;
        }
    };
}
class tut43{
    public static void main(String[]args){
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    };
};