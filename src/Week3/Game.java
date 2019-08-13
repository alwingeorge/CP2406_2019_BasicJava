package Week3;

import java.util.Random;

class Game {
    private Random random = new Random();
    int secret = random.nextInt(10) + 1;
    int wins;
    int count;

    void makeGuess(int value) {
        count +=1;
        if (value == secret) {
            wins +=1;
        }
    }
}
