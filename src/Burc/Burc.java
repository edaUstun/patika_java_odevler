package Burc;

import java.util.Scanner;

public class Burc {

    public Burc() {
        Scanner scanner = new Scanner(System.in);

        int day, month;
        System.out.print("Dogdugunuz ay: ");
        month = scanner.nextInt();
        System.out.print("Dogdugunuz gun: ");
        day = scanner.nextInt();

        if(month==1) {
            if(day>=1 && day<=31) {
                if(day<22) {
                    System.out.println("Oglak");
                } else {
                    System.out.println("Kova");
                }
            } else {
                System.out.println("Hatali Gun Girildi");
            }
        } else if (month==2) {
            if(day>=1 && day<=30) {
                if(day<=19) {
                    System.out.println("Kova");
                } else {
                    System.out.println("Balik");
                }
            } else {
                System.out.println("Hatali Gun Girildi");
            }
        } else if (month==3) {
            if(day>=1 && day<=30) {
                if(day<=20) {
                    System.out.println("Balik");
                } else {
                    System.out.println("Koc");
                }
            } else {
                System.out.println("Hatali Gun Girildi");
            }
        } else if (month==4) {
            if(day>=1 && day<=30) {
                if(day<=20) {
                    System.out.println("Koc");
                } else {
                    System.out.println("Boga");
                }
            } else {
                System.out.println("Hatali Gun Girildi");
            }
        } else if (month==5) {
            if(day>=1 && day<=30) {
                if(day<=21) {
                    System.out.println("Boga");
                } else {
                    System.out.println("Ikizler");
                }
            } else {
                System.out.println("Hatali Gun Girildi");
            }
        } else if (month==6) {
            if(day>=1 && day<=30) {
                if(day<=22) {
                    System.out.println("Ikizler");
                } else {
                    System.out.println("Yengec");
                }
            } else {
                System.out.println("Hatali Gun Girildi");
            }
        } else if (month==7) {
            if(day>=1 && day<=30) {
                if(day<=22) {
                    System.out.println("Yengec");
                } else {
                    System.out.println("Aslan");
                }
            } else {
                System.out.println("Hatali Gun Girildi");
            }
        } else if (month==8) {
            if(day>=1 && day<=30) {
                if(day<=22) {
                    System.out.println("Aslan");
                } else {
                    System.out.println("Basak");
                }
            } else {
                System.out.println("Hatali Gun Girildi");
            }
        } else if (month==9) {
            if(day>=1 && day<=30) {
                if(day<=22) {
                    System.out.println("Basak");
                } else {
                    System.out.println("Terzi");
                }
            } else {
                System.out.println("Hatali Gun Girildi");
            }
        } else if (month==10) {
            if(day>=1 && day<=30) {
                if(day<=22) {
                    System.out.println("Terzi");
                } else {
                    System.out.println("Akrep");
                }
            } else {
                System.out.println("Hatali Gun Girildi");
            }
        } else if (month==11) {
            if(day>=1 && day<=30) {
                if(day<=21) {
                    System.out.println("Akrep");
                } else {
                    System.out.println("Yay");
                }
            } else {
                System.out.println("Hatali Gun Girildi");
            }
        } else if (month==12) {
            if(day>=1 && day<=30) {
                if(day<=22) {
                    System.out.println("Oglak");
                } else {
                    System.out.println("Kova");
                }
            } else {
                System.out.println("Hatali Gun Girildi");
            }
        } else if (month > 12) {
            System.out.println("Hatali Giris");
        } else {
            System.out.println("Hatali Giris");
        }
    }
}
