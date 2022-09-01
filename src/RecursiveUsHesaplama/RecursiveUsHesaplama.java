package RecursiveUsHesaplama;

import java.util.Scanner;

public class RecursiveUsHesaplama {

    public int result = 1;
    public int us(int a, int b){
        if (a == 0){
            return 1;
        }

        result *= b;
        us(a-1,b);
        return result;
    }

    public RecursiveUsHesaplama() {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        System.out.print("Taban: ");
        y = scanner.nextInt();
        System.out.print("Us: ");
        x = scanner.nextInt();

        System.out.println("Sonuc: " + us(x,y));

        scanner.close();
    }
}
