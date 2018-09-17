package Assignment1;
 public class TestEmp {

       public static void main(String[] args) {
           EmailApp em1=new EmailApp("Deepa","Gabadari");
           EmailApp em2=new EmailApp("Rani","Deepa");
           System.out.println(em1.showinfo());
           System.out.println(em2.showinfo());
       }
   }