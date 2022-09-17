package DiziElemanFrekansi;

import java.util.Arrays;

public class DiziFrekans {

    public boolean isFind(int [] arr, int value) {
        for(int i : arr) {
            if(i == value) {
                return true;
            }
        }
        return false;
    }
    public DiziFrekans() {

        int tekrar = 0;
        int [] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int [] frekans = new int[list.length];

        for(int i=0; i<list.length; i++) {
            frekans[i] = 1;
        }


        for(int i=0; i<list.length; i++) {
            for(int j=0; j<list.length; j++) {
                if((i!=j) && (list[i] == list[j])) {
                    frekans[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(frekans));


        for(int i=0; i<list.length; i++) {
            for (int j=0; j<list.length; j++) {
                if((i!=j) && (list[i]==list[j])){
                    list[j]=0;
                }
            }
        }
        System.out.println(Arrays.toString(list));


        for(int i=0; i<list.length; i++) {
            if(frekans[i]>=1) {
                if(list[i]!=0){
                    System.out.println(list[i] + " sayisi " + frekans[i] + " kere tekrar edildi.");
                }
            }
        }








    }

/*
System.out.println("Dizi : " + Arrays.toString(array));

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length; j++) {
                if(array[i]==array[j]) {
                    if (!isFind(frekans, array[i])){
                        frekans[i] = array[i];
                        tekrar++;
                    }

                }
            }
            System.out.println(array[i] + " sayiii " + tekrar + " tekrar edildi");
        }

        tekrar = 0;
 */

}
