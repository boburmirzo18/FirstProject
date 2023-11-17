import java.util.Random;

public class MinAndMax {
    public static void main(String[] args) {





                int[] tab = new int[10];

                Random randomNumber = new Random();
                for (int i = 0; i < tab.length; i++) {
                    tab[i] = randomNumber.nextInt(100) + 1;
                }


                int minNumber = tab[0];
                int maxNumber = tab[0];


                for (int i = 1; i < tab.length; i++) {
                    if (tab[i] < minNumber) {
                        minNumber =tab [i];
                    }
                    if (tab[i] > maxNumber) {
                        maxNumber = tab[i];
                    }
                }


                System.out.println("Min number in the array is: " + minNumber);
                System.out.println("Max number in the array is: " + maxNumber);
            }
        }








