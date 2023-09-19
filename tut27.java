class MyEmployee{
    private int id;
    private String name;
    
    public void setName(String n){
        name = n ;
    }
    public String GetName(){
        return name;
    }
    public void Setid (int i ){
        id = i;
    }
    public int Getid(){
        return id ;
    }
};

class tut27{
    public static void main(String []args){
        MyEmployee obj = new MyEmployee();
        //obj.id = 55;
        //obj.name = "Dushyant"; ---> throw an error bcz we use private access modifire

        obj.setName("Dushyant");
        obj.Setid(55);

        
        System.out.println(obj.GetName());
        System.out.println(obj.Getid());
    };
};