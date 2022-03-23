class Student3{
    int id= 1;
    String name= "Deep";
    //method to display the value of id and name
    Student3(){
        System.out.println("1");
    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String args[]){
//creating objects  
        Student3 s1=new Student3();
        Student3 s2=new Student3();
//displaying values of the object  
        s1.display();
        s2.display();
    }
}  