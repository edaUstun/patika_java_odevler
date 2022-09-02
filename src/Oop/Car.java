package Oop;

class Car {
    // modelleme islemi

    // Nitelikler
    String type = "sedan";
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    Car() {
        System.out.println("Nesne Olusturdu.");
    }

    // Metotleri - Davranislari
    void increaseSpeed (int increment) {
        if((speed+increment) < speedLimit)
            speed += increment;
    }

    void decreaseSpeed (int decrease) {
        if(speed>0)
            speed -= decrease;
    }

    void printSpeed() {
        System.out.println(model + " Hiziniz: " + speed);
    }
}
