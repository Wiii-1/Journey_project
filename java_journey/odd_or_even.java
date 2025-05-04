import java.util.Scanner;

public class odd_or_even {
     public static void main (String[]args){
          checker ck = new checker();
          
          ck.check();

     }
 }


class checker {
     Scanner s = new Scanner(System.in);

     public void check() {
          
          System.out.print("\n\nEnter a number to know whether it's odd or even: ");

          int num = s.nextInt();

          if( num % 2 == 0){
               System.out.println("\nit's even\n");
          }
          else{
               System.out.println("\nit's odd\n");
          }
     }
}