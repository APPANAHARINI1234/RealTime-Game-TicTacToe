package player;

public class Player {
    String name;
    double contact;
   public char symbol;
    int age;
    public Player(){
        symbol='#';
    }
   
//    public Player(String name,double contact,int age){
//         this.name=name;
//         this.contact=contact;
//         this.age=age;
//     }
    public void setName(String name){
        this.name=name;
    }
    public void setContact(double contact){
        this.contact=contact;
    }
    public void setAge(int age){
        this.age=age;
    }
     public void getPlayer(){
        System.out.println("Name:"+name);
        System.out.println("contact:"+contact);
        System.out.println("age:"+age);
    }

}
