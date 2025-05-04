import java.util.Scanner;

class changer{
    Scanner input = new Scanner(System.in);
    

    public void logic (){
        System.out.print("give a number that you want to convert: ");
        int number = input.nextInt();

        System.out.print("what would like to convert to celsius or fahrenheit: ");   
        String decision = input.next();
        
        if (decision.equalsIgnoreCase("celsius")) {
            celsius(number);
        } else if (decision.equalsIgnoreCase("fahrenheit")) {
            fahrenheit(number);
        } else {
            System.out.println("invalid choice");
        }
        input.close();
    }

    // converts celsius to fahrenheit
    public void celsius (int number){
        Double Fahrenheit = (number * 1.8) + 32;
        System. out.println("the temperature in fahrenheit is: " + Fahrenheit);
    }


    // converts fahrenheit to celsius
    public void fahrenheit (int number){
        Double Celsius = (number - 32) / 1.8;
        System.out.println("the temperature in celsius is: " + Celsius); 
        
    }
}

public class temp_converter { 
    public static void main (String[]args){
        changer change = new changer();
        change.logic();
    }
}
