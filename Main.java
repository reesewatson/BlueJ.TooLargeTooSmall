 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int secretNumber;
        secretNumber = (int) (Math.random() * 77);

        Scanner input = new Scanner(System.in);
        int guess;
        int count = 0;
        do {
            System.out.print("Enter a guess: (1-77) ");
            guess = input.nextInt();
            System.out.println("Your guess is " + guess);
            if (guess == secretNumber)
                System.out.println("Congratulations! Your guess is correct.");

            else if (guess < secretNumber)
                System.out.println("Your guess is smaller than the secret number.");

            else if (guess > secretNumber)
                System.out.println("Your guess is greater than the secret number.");
            count = count + 1;

        } while (guess != secretNumber);
        System.out.println("Your number of guesses is: " + count);
    }
} 
