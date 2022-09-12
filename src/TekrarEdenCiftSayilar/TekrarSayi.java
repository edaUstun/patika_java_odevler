package TekrarEdenCiftSayilar;

import java.util.Arrays;

public class TekrarSayi {

    public boolean isFind(int [] arr, int value) {
        for(int i : arr) {
            if(i == value) {
                return true;
            }
        }
        return false;
    }
    public TekrarSayi() {

        int [] list = {2,6,7,2,9,6,8,9,2,6,8};
        int [] duplicate = new int[list.length];

        int startIndex = 0;

        for(int i=0; i<list.length; i++) {
            for(int j=0; j<list.length; j++) {

                if((i!=j) && (list[i]==list[j])) {
                    if(list[i]%2==0) {
                        if(!isFind(duplicate, list[i])) {
                            duplicate[startIndex++] = list[i];
                        }
                        break;
                    }
                }
            }
        }

        for (int value : duplicate) {
            if(value != 0){
                System.out.print(value + " ");
            }
        }

    }
}
