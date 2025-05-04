import java.util.Scanner;

public class cal {
    public static void main (String[]args){

        String [] option  = {"Addition ", "Substraction ", "Muliplication ", "Division"}; 
        
        Scanner scanner = new Scanner(System.in);

        int first_num;
        int second_num;
        String choice;
        int results;
        
        
        while (true) {
            System.out.print("enter a number: ");
            first_num = scanner.nextInt();

            System.out.print("enter another number: ");
            second_num = scanner.nextInt();

            System.out.println("\ncurrently the available choices are:  ");

            for (String i : option){
                System.out.print(i);
            }

            System.out.print("\n");

            System.out.println("\nchoose an operation: " );
            choice = scanner.next();

            if (choice.equalsIgnoreCase("exit")){
                System.exit(0);
            }
            

            switch (choice.toLowerCase()) {
                case "addition"      -> {results = first_num + second_num;}
                case "substraction"  -> {results = first_num - second_num;}
                case "muliplication" -> {results = first_num * second_num;}
                case "division"      -> {results = first_num / second_num;}
                default              -> {System.out.println("Invalid choice"); return;}
            }

            System.out.println("\n"+ results);

            
        }
        
    }
}
