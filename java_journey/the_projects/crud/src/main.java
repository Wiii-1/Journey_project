import java.util.Scanner;

public class main {

    public void check(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("If you want to check number whether if it's odd or even in: ");
        int n = scanner.nextInt();

        if (n % 2 == 0){
            System.out.println("It's Even");
        }else {
            System.out.println("It's Odd");
        }

        scanner.close();
    }

    public static void main(String[]args){
        main main = new main();
        multiply multiply = new multiply();
        sumOfNaturals sum = new sumOfNaturals();


        //main.check();
        //multiply.multiplication();
        sum.Sum();
    }
}

class multiply {
    public void multiplication (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("what do you want to multiply up to 10 to?  ");
        int y = scanner.nextInt();
        int j = scanner.nextInt();

        for(int i = 1; i<=j; i++){
            System.out.println(y + " * " + i + " = " + y * i);
        }
    }
}

class sumOfNaturals {
    public void Sum () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("do you want to know the sum of naturals of a number input one and see it for yourself: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            if
        }

        System.out.println(" = " + sum);

    }
}




