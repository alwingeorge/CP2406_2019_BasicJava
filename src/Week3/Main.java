package Week3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        while (true){
            System.out.print("\nplease make guess ");
            int guess = scanner.nextInt();
            game.makeGuess(guess);

            System.out.print("\nGuess:  " + game.count);
            System.out.print("\nWins:  " + game.wins);

            if (guess ==0){
                break;
            }
        }

    }
}
