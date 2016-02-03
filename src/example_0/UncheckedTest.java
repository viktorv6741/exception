package example_0;

import java.util.Scanner;

public class UncheckedTest {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Please, enter the number");
        int someDigit = console.nextInt();


        try{
            System.out.println(factorial(someDigit));
        }
        catch(FactorialException exception){

            System.out.println(exception.getMessage());
            System.out.println("********************************");
            System.out.println(exception.getInfo());
            System.out.println("********************************");


        }

    }

    public static int factorial(int number)throws FactorialException{
        if (number < 0) throw new FactorialException("Inappropriate value, can not be less then 0", number);
            //if (number < 0) return 1;
        else return number * factorial(number - 1);
    }

    }

