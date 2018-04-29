import java.util.Arrays;
import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

        //Initializing
        int[] mas = new int[10];
        int maxn_i=-1,minp_i=-1,predmaxn = -1, predminp = -1;

        //Filling numbers
        System.out.println("Array:");
        for(int i=0;i<mas.length;i++){
            mas[i]=((int) (Math.random()*20)) -10;
            System.out.printf("Value: %d, Index: %d\n",mas[i],i);
        }

        //Finding max negative and min positive
        while(true) {
            for (int i = 0; i < mas.length; i++) {
                if ((minp_i == -1) && (mas[i] > 0)) {
                    minp_i = i;
                    continue;
                }
                if ((maxn_i == -1) && (mas[i] < 0)) {
                    maxn_i = i;
                    continue;
                }
                if ((mas[i] > 0) &&  (mas[i] < mas[minp_i])) {
                    minp_i = i;
                    continue;
                }
                if ((mas[i] < 0) && (mas[i] > mas[maxn_i])) {
                    maxn_i = i;
                    continue;
                }
            }
            if ((maxn_i == predmaxn) && (minp_i == predminp)) {
                break;
            } else {
                predmaxn = maxn_i;
                predminp = minp_i;
            }
        }
        System.out.println("Min positive: " +mas[minp_i]);
        System.out.println("Max negative: " + mas[maxn_i]);

        //Swap numbers
        mas[minp_i] = mas[minp_i] + mas[maxn_i];
        mas[maxn_i] = mas[minp_i] - mas[maxn_i];
        mas[minp_i] = mas[minp_i] - mas[maxn_i];

        System.out.println("After swap");
        System.out.println("Min positive: " +mas[minp_i]);
        System.out.println("Max negative: " + mas[maxn_i]);
    }
}
