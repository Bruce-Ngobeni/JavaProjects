package za.co.wethinkcode;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();

        try {
            int intUserInput = Integer.parseInt(userInput);
            System.out.println(fizzBuzz(intUserInput));
        } catch (NumberFormatException e){
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    public static String fizzBuzz(int num){

        if (num % 3 == 0 && num % 5 == 0){
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        }
        else return String.valueOf(num);
    }


}
