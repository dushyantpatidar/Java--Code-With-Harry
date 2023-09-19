class Ovrmthd{

    static void telljoke(){ // using void = without return type mention print the hellow world 
        System.out.println("Hello world");
    };

    static void change(int a ){
        a = 98 ;
    };

    static void Arary(int []xee){
        xee[0] = 98;
    }

    // 3. Method Overloding
    static void name(){
        System.out.println("HEllO Good Morning: ");
    };
    static void name(int a ){
        System.out.println("Hello Good Morning "+a+" Ok Bye!");
    };

    public static void main(String[] args) {
        //telljoke(); // using direct calling 

        // 1. copying system in methods in int
        //int x = 15 ;
        //change(x);
        //System.out.println(x);ssss

        // 2. copying system in Arrarys
        //int [] arr = {22,54,73,32};
        //Arary(arr); 
        //System.out.println(arr[0]); -------
        //System.out.println(arr[1]);

        // 3. Method Overloding
        int b = 55;
        name();
        name(b);

    };
}
