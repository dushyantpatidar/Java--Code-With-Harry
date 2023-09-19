class Phone {
    public void showTime(){
        System.out.println("Time is 8 am");
    };
    public void on(){
        System.out.println("I am a Java of Class Phone");
    }
};

class Smartphone extends Phone{
    public void music(){
        System.out.println("Play Music....");
    }
    public void on(){
      System.out.println("I am a Java of Class Smartphone");
    }
}


class tut33{
    public static void main(String []args){
        //Phone obj = new Phone(); Allowed 
        //Smartphone obj1 = new Smartphone(); // Allowed
        //obj.name();

        //Smartphone sm = new Phone() ; // NOT Allowed
        Phone ph = new Smartphone(); // Allowed 
        ph.on();
        ph.showTime();
        //  ph.music();   // throw error  Not Allowed 
    }
}