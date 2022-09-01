package Palindrom;

import java.util.Scanner;

public class Palindrom {

    public boolean isPalindrom(int number) {

        int temp = number;
        int reverseNumber = 0, lastNumber;

        while (temp!=0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber*10) + lastNumber;
            temp /= 10;
        }

        if(number == reverseNumber) {
            System.out.println(number + " is Palindrom Number.");
        } else {
            System.out.println(number + " is not Palindrom Number.");
        }

        return true;
    }
    public Palindrom() {

        Scanner scanner = new Scanner(System.in);

        isPalindrom(364);
        isPalindrom(363);


        scanner.close();
    }
}
