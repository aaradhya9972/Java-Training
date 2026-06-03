import java.util.Scanner;

class GuessGame {
    int secretNumber = 50;

    public void checkGuess(int guess) {
        if (guess > secretNumber) {
            System.out.println("Your guess is greater than the number.");
        } else if (guess < secretNumber) {
            System.out.println("Your guess is less than the number.");
        } else {
            System.out.println("Congratulations! You guessed the correct number.");
        }
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Guess the number: ");
        int guess = sc.nextInt();

        GuessGame game = new GuessGame();
        game.checkGuess(guess);

        sc.close();
    }
}