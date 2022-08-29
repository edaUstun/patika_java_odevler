package MaxMin;

import java.util.Scanner;

public class MaxMin {

    public MaxMin() {

        Scanner scanner = new Scanner(System.in);

        int numbers;

        System.out.print("Kac tane sayi gireceksiniz: ");
        numbers = scanner.nextInt();

        int max=1, min=1;

        for(int i=1; i<=numbers; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            numbers = scanner.nextInt();

            if(i==1) {
                min = numbers;
                max = numbers;
            } else {
                if(numbers > max) {
                    max = numbers;
                }
                if(numbers < min)  {
                    min = numbers;
                }
            }
        }


        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);

        scanner.close();
    }
}
