import java.util.Scanner;

public class HesapMakinesi {

    public HesapMakinesi() {

        int num1, num2, select;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayi: ");
        num1 = scanner.nextInt();

        System.out.print("Ikinci sayi: ");
        num2 = scanner.nextInt();

        System.out.println("Lutfen yapmak istediginiz islemi seciniz: ");
        System.out.println("1 - Toplama\n2 - Cikarma \n3 - Carpma \n4 - Bolme");
        System.out.print("Seciminiz: ");
        select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam: " + (num1+num2));
                break;
            case 2:
                System.out.println("Fark: " + (num1-num2));
                break;
            case 3:
                System.out.println("Carpma: " + (num1*num2));
                break;
            case 4:
                System.out.println("Bolme: " + (num1/num2));
                break;
            default:
                System.out.println("Tanimsiz Giris");
        }
        scanner.close();
    }
}
