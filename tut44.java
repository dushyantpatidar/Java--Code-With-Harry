class MyThreadRunable1 implements Runnable{
    public void run(){
        int i = 0 ;
        while(i<20){
            System.out.println("My Cooking Thread is Running ");
            System.out.println("I am Happy");
            i++;
        }
    };
};

class MyThreadRunable2 implements Runnable{
    public void run(){
        int j = 0 ;
        while(j<20){
            System.out.println("thread 2 for chatting with her ");
            System.out.println("I am Sad");
            j++;
        }
    };
};

class tut44{
    public static void main(String[]args){
        MyThreadRunable1 bullet1 = new MyThreadRunable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunable2 bullet2 = new MyThreadRunable2();
        Thread gun2 = new Thread(bullet2);

        //bullet1.start(); not allow , because we implements 
        //bullet2.start();
        gun1.start();
        gun2.start();

    }
}