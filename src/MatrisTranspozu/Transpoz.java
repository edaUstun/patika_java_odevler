package MatrisTranspozu;

import java.util.Arrays;

public class Transpoz {

    public Transpoz() {

        int [][] matris = {{2,3,4}, {5,6,4}};


        System.out.println("Matris");
        for(int i=0; i<matris.length; i++) {
            for(int j=0; j<matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matris Transpozu");
        for(int i=0; i< matris[0].length;i++) {
            for(int j=0; j<matris.length; j++) {
                System.out.print(matris[j][i] + " ");
            }
            System.out.println();
        }
    }
}
