class MYEmployee{
    private int id;
    private String name;
    
    //public MYEmployee(){  //.....make a Constroctor---
    //    id = 77 ;
    //    name = "Dushyant";
    //};


    public MYEmployee(String a , int myid){  //.....make a Constroctor--- // arguments bhi pass kr shakthe h
        id = myid ;
        name = a;
    };

    public String GetName(){
        return name ;
    }
    
    public int Getid(){
        return id ;
    }
    public void Setid (int i ){
        id = i;
    }
    public void setName(String n){
        name = n ;
    }
};
class tut28{
    public static void main(String[] args) {
        //MYEmployee obj = new MYEmployee(); for without argumnet 
        MYEmployee obj = new MYEmployee("Dushyant" , 55); // for argument in con
        //obj.setName("Dushyant");
        //obj.Setid(55);
        //System.out.println(obj.GetName());
        //System.out.println(obj.Getid());

        System.out.println(obj.Getid());// call without set a value because constroctor is there
        System.out.println(obj.GetName());
    };
};