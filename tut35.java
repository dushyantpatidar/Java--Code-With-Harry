
interface Bycycle{
    void applyBreak(int decrement);
    void speedUp(int increment);
    int a = 45 ;
}

interface HornBycycle{
    int b = 44 ; 
    void bhorn();
    void ahorn();
}

class AvonCycle implements Bycycle , HornBycycle {
    public void BlowHorn(){
        System.out.println("Peeee Peeeee Pooooo Peeeee");
    };
    public void applyBreak(int decrement){
        System.out.println("Appyling Break...!");
    };
    public void speedUp(int increment){
        System.out.println("Applying Speed....!");
    };

    public void bhorn(){
        System.out.println("kabhi khushi kabhi gum");
    };
    public void ahorn(){
        System.out.println("PePe Pepe PoPo PoPo");
    };
}


class tut35{
    public static void main(String[]args){
        AvonCycle a = new AvonCycle();
        a.applyBreak(1);
        // You can create properities in InterFaces as they are final 
        // System.out.println(a.a);

        a.ahorn();
        a.bhorn();
    }
}