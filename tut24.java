class Varargument{
    //static int sum(int a , int b){
    //    return a + b ;
    //}
    //static int sum(int a , int b, int c){
    //    return a + b+c ;
    //}
    //static int sum(int a , int b , int c , int d){
    //    return a + b+c+d ;
    //}
    static int sum(int ...arr){
        int result = 0 ;
        for(int a :arr){
            result += a ;
        };
        return result;
    }
    public static void main(String[] args) {
        //int x = 5 , y = 7 , m = 2  , n = 55 , p = 88;
        //int z = sum(x, y );
        //System.out.println(z);
        //int ze = sum(x, y , m );
        //System.out.println(ze);
        //int zee = sum(x, y , m , n);
        //System.out.println(zee);
        //int cc = sum();
        //System.out.println(sum(55,66,88,99,854)); ------transfer and store in a array 

    }
}