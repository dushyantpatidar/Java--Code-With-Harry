
interface Camera{
    void takeSnap();
    void recordVideo();
    //private void greett(){
    //    System.out.println("Good Morning...");
    //};
    default void record4KVideo(){ // default method in interfaces  
        System.out.println("Recording 4k...!");
    };
} ;

interface wifee{
    String [] getNetwork();
    void connectToNetwork(String network);
};

class CellPhone{
    public void CallNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    };
    public void pickNumber(){
        System.out.println("Connecting.......");
    };
};

class SmartPhone extends CellPhone implements Camera , wifee{
    public void takeSnap(){
        System.out.println("Taking snap...!");
    };
    public void recordVideo(){
        System.out.println("Taking Video...!");
    }
    public String [] getNetwork(){
        System.out.println("List of Networks..");
        String [] networkList = {"A" , "B" , "C" , "D"};
        return networkList;
    };
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
};
class tut36{
    public static void main(String[]args){
        SmartPhone  a = new SmartPhone();
        a.record4KVideo(); // print direct 
        //String [] ar = a.getNetwork();
        //for (String item : ar) {
        //    System.out.println(item);
        //}
    }
}
