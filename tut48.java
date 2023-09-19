class tut48 {
    public static void main(String[]args){
        int a = 6000;
        int b = 0; // Arithamtic Exception is Genrated
        //int c = a/b;
        //System.out.println(c); // wihtout try 


        // With Try Concept-----------
        try{
            int c = a/b;
            System.out.println("The Result is : "+c);
        }
        catch(Exception e ){
            System.out.println("We fail to div");
            System.out.println(e); // write the reason of exception 
        }
        System.out.println("End of the Program ");
    }
}
