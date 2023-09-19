class NegaviteRadiusException extends Exception{
    @Override
    public String toString() {
        return "Redius Cannot be Negative ";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class tut52 {
    public static double area(int r ) throws ArithmeticException{
        if(r<0){
            throw new NegativeArraySizeException
        }
        double Result = Math.PI * r * r ;
        return Result ; 
    }
    public static int divide(int a, int b) throws ArithmeticException {
        // Made by Me
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        // Shivam -- Used divide Function created by me
        try {
            int c = divide(5, 0);
        } catch (Exception e) {
            System.out.println(e);
        }
        double ar = area(6);
    }
}
