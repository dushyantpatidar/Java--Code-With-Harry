class tut54 {
    public static int greet(){
        try{
            int a = 5 ;
            int b = 0 ;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{ // Finally block har Hall me run hoke hi manegaa
            System.out.println("This is Final Block ");
        }
        return -1 ;
    }
    public static void main(String[]args){
        int k = greet();
        System.out.println(k);

        int a = 5 ;
        int b = 7;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e ){
                System.out.println(e+"\n");
                break;
            }
            finally{
                System.out.println("I an Finally value of b is :\n"+b);
            }
            b--;
        }

    }
}
