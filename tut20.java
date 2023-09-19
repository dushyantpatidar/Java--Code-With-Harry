class tut20{
    public static void main(String[]args){
        int []arr = {43,12,11,55};
        //System.out.println(arr[1]);
        System.out.println(arr.length);
        float [] marks = {29.0f , 47.96f , 45.05f , 34.00f};
        System.out.println(marks[2]);
        String [] name = {"Dushyant " , "Patidar" , "Disha" , "Paliwal"};
        System.out.println(name[1]);
        System.out.println("   ");

        // Display a full array 
        //for(int i = 0 ; i<=name.length; i++){
        //    System.out.println(name[i]);
        //}

        // Display a full array-- reverse  
        for(int i = marks.length -1; i>=0; i--){
            System.out.println(name[i]);
        }

        

    }
}