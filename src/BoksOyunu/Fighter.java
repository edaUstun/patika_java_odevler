package BoksOyunu;

import java.util.Random;

public class Fighter {

    String name;
    int damage;
    int health;
    int weight;

    int dodge;

    Random random = new Random();

    Fighter(String name, int health, int weight, int dodge) {
        this.name = name;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter foe) {

        this.damage = random.nextInt(10,40);
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu");

        if(foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;

        return true;
    }

}
