package player;

import java.text.DecimalFormat;

public class Player {
     private String name;
     private String surname;
     private double contact;
     private int age;
     private String collegeName;
     public char symbol;
    public void setName(String name){
        this.name=name;
     }
     public void setSurname(String surname){
        this.surname=surname;
     }
    public  int setContact(double contact){
       
        int digits=(int)Math.log10(contact)+1;
        if(digits>10||digits<10){
            System.out.println("Invalid contact number!Please reenter contact number");
            return 0;
        }
        else{
            this.contact=contact;
           
        return 1;
        }
     }
    public  void setAge(int age){
        this.age=age;
     }
    public void setCollgeName(String collegeName){
          this.collegeName=collegeName;
     }
    public String getName(){
        return this.surname+" "+this.name;
     }
    public void getDetails(){
        System.out.println("Player details:");
        System.out.println("Name : "+this.surname+" "+this.name);
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(0);
        System.out.println("Mobile number : "+df.format(contact));
         System.out.println("Age : "+this.age);
         System.out.println("CollegeName : "+this.collegeName);
     }

}
