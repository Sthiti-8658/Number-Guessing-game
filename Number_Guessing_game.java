package java_projects;
import java.util.Scanner;
import java.util.Random;

public class Number_Guessing_game {
    public static void main(String[] args) {
        Random rand =new Random();
        int numberToGuess=rand.nextInt(100)+1;
        Scanner scanner=new Scanner(System.in);
        int numberOfTries =0;
        int guess =0;
        boolean win =false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while(!win){
            try {
                guess = Integer.parseInt(scanner.nextLine());
                numberOfTries++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low.try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high.try again.");
                } else {
                    win = true;
                }
            }catch(NumberFormatException e){
                System.out.println("Invalid input.Please enter a valid number.");
            }
        }
        System.out.println("congratulations! you've guessed the correct number.");
        System.out.println("It took you "+numberOfTries +"tries.");
        scanner.close();

    }
}
