package Oop;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car();
        audi.model="Audi";
        audi.speed = 10;

        audi.increaseSpeed(20);
        audi.decreaseSpeed(5);

        audi.printSpeed();


        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 20;

        bmw.increaseSpeed(20);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(60);
        bmw.increaseSpeed(100);

        bmw.printSpeed();


        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 30;

        mercedes.printSpeed();
    }
}
