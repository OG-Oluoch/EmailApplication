package Emailapp;

import java.util.Scanner;

public class Email {

    //declare the instance variables
  private String firstname;
   private String lastname;
   private String password;
  private String department;
  private int mailboxCapacity;
  private String alternateEmail;
  private int passwordLength = 10;
  private String email;
  private String companySuffix = "msncomopany.com";

  // constructor to initialize names
public Email(String firstname,String lastname){

    this.firstname =firstname;
    this.lastname = lastname;
    System.out.println("Email created successsfully "+ this.firstname+ " " + this.lastname);

//call method to prompt user to enter department
    this.department = setDepartment();
    System.out.println("Department:" + this.department);

    //called method returns a random passwords
    this.password = randomPassword(passwordLength);
    System.out.println("Your password is: "+this.password);

    //generate an email
    email = firstname.toLowerCase() + "" + lastname.toLowerCase()+ "@" +department+"." + companySuffix;
    System.out.println("Your email is " +email);
}

    //Get department
   public String setDepartment(){

       System.out.println("Enter your department \n1 for Dispath \n2 for Finance \n3 for Graveyard \n0 For None");
       Scanner input = new Scanner(System.in);
       int depSelect = input.nextInt();
       if(depSelect == 1) {return " Dispatch";}
       else if(depSelect == 2) {return "Finance";}
       else if(depSelect == 3) {return "Graveyard";}
       else {return" ";}

   }
    //generate a random password
  public String randomPassword(int length){

    String passwordOption = "ABCDEFHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*?()*><.,";
    char[] password = new char[length];
    for(int i=0;i<password.length;i++){
   int rand =(int) (Math.random()*passwordOption.length());
   password[i] = passwordOption.charAt(rand);

    }
   return new String (password);
  }
    //set the mailbox capacity
public void setMailboxCapacity(int capacity){

    this.mailboxCapacity = capacity;
}
//set the alternate email
    public void setAlternateEmail(String altEmail){

    this.alternateEmail = altEmail;
    }
    //change the password
    public void changePassword(String password){

    this.password = password;
    }
    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}

    public String showInfo(){

    return "Display Name: "+firstname+ " "+lastname+"Company Email "+email+"Mailbox capacity "+mailboxCapacity+" mb";
    }

}
