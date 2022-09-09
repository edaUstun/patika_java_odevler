package BoksOyunu;

public class Match {

    // 2 oyuncu
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;

        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    // maca baslama
    void run() {
        if(isCheck()) {
            System.out.println(this.f2.name + " Saglik : " + this.f2.health);
            System.out.println(this.f1.name + " Saglik : " + this.f1.health);

            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("==== YENI RAUND ====");
                this.f2.health = f1.hit(f2);
                if(isWin()) {
                    break;
                }

                this.f1.health = f2.hit(f1);
                if(isWin()) {
                    break;
                }

                System.out.println(this.f2.name + " Saglik : " + this.f2.health);
                System.out.println(this.f1.name + " Saglik : " + this.f1.health);

            }
        } else {
            System.out.println("Kilo degerleri tutmamaktedir.");
        }
    }

    // kilo kontrol
    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if(this.f1.health == 0) {
            System.out.println(this.f2.name + " KAZANDI");
            return true;
        }

        if(this.f2.health == 0) {
            System.out.println(this.f1.name + " KAZANDI");
            return true;
        }

        return false;
    }
}
