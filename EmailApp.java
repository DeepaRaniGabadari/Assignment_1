package Assignment1;

   import java.util.Scanner;

   public class EmailApp {
       private String fName;
       private String lName;
       private String pass;
       private String dept;
       private int mailboxcapacity=999;
       private String email;
       private int defaultPasswordLength=10;
       private String alternateEmail;
       private String companySuffix="company.com";

    
       public EmailApp(String fName,String lName) {
           this.fName = fName;
           this.lName = lName;
   

           
           this.dept=setDepartment();

           this.pass=randomPassword(defaultPasswordLength);
           System.out.println("Your password is: "+this.pass+"\n\n");
           
           email=fName.toLowerCase()+"."+lName.toLowerCase()+"@" +dept+"."+companySuffix;
 
       }

       private String setDepartment() {
           System.out.print("New Worker: "+fName + "\nDEPARTMENT CODES:\n1 for sales\n2 for development\n3 for accounting\n0 for none\nEnter the department code: ");
           Scanner in=new Scanner(System.in);
           int depchoice=in.nextInt();
           if(depchoice==1) {
               return "sales";
           }
           else if(depchoice==2) {
               return "development";
           }
           else if(depchoice==3) {
               return "accounting";
           }
           else {
               return "";
           }
       }
       
       private String randomPassword(int length) {
           String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
           char[] password=new char[length];
           for(int i=0;i<length;i++) {
               int rand=(int) (Math.random()*passwordSet.length());
               password[i]=passwordSet.charAt(rand);
           }
           return new String(password);
       }

   
       public void setMailboxCapacity(int capacity) {
           this.mailboxcapacity=capacity;
       }
    
       public void setAlternateEmail(String altEmail) {
           this.alternateEmail=altEmail;
       }

       
       public void changePassword(String password) {
           this.pass=password;
       }

       public int getMailboxCapacity() { return mailboxcapacity; }
       public String getAlternateEmail() { return alternateEmail; }
       public String getPassword() { return pass; }

       public String showinfo() {
           return "DISPLAY NAME: "+fName+" "+lName+
                   "\nCOMPANY EMAIL: "+email+
                   "\nMAILBOX CAPACITY: "+mailboxcapacity+"mb"+"\n";
       }

   }