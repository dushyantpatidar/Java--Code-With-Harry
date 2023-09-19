class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    };
    public void run(){
        //System.out.println("Thank You "+this.getName());
        int i = 0;
        while(i<10){
        //    System.out.println("I am a thread ");
              System.out.println("Thank You "+this.getName());
            i++;
        }
    }
}
class tut46 {
    public static void main(String[] args) {
        // Thread Priorities ------------
        // Ready Queue : T1 T2 T3 T4 T5 
        MyThr1 m1 = new MyThr1("Dushyant1");
        MyThr1 m2 = new MyThr1("Dushyant2");
        MyThr1 m3 = new MyThr1("Dushyant3");
        MyThr1 m4 = new MyThr1("Dushyant4");
        MyThr1 m5 = new MyThr1("Dushyant5 (Most Important)");
        MyThr1 m6 = new MyThr1("Dushyant6");

        m3.setPriority(Thread.MAX_PRIORITY); // --- Declaring the Max Priority to .
        m1.setPriority(Thread.MIN_PRIORITY);

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
        m6.start();
    }
}
