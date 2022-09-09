package BoksOyunu;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Fighter f1 = new Fighter("Hasan",  120, 100, 100);
        Fighter f2 = new Fighter("Kayra", 85, 85, 50);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}
