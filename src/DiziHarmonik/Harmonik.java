package DiziHarmonik;

public class Harmonik {

    public Harmonik() {
        double [] numbers = {1,2,3,4,5};
        double sum = 0.0;

        for(int i=0; i<numbers.length; i++) {
            sum += (1/numbers[i]);
        }

        double avarage = sum / (numbers.length);
        System.out.println(avarage);
    }
}
