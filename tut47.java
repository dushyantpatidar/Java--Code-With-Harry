class MyThr2 extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
        //    System.out.println("I am a thread ");
              System.out.println("Thank You "+i);
              try{
                Thread.sleep(1900); // es method ko use krne se , speed slow ho jayegi 
              }
              catch(InterruptedException e) {
                e.printStackTrace();
              }
            i++;
        }
    }
}
class MyThr3 extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
        //    System.out.println("I am a thread ");
              System.out.println("Thank You: For Special  "+i);
            i++;
        }
    }
}
class tut47 {
    public static void main(String[] args) {
        MyThr2 a = new MyThr2();
        MyThr3 a1 = new MyThr3();

        a.start();

//        try{
//            a.join(); // jab a pura khatam ho jayega loop tbhi a1 chalega 
//        }
//        catch(Exception e ){
//            System.out.println(e);
//        }
        
        a1.start();
    }
}
