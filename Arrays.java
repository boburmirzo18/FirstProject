

public class Arrays {


    public static void main(String[] args) {


        int[] array = new int[10];
        int counter = 0;


        for (int i = 0; i < 10; i++) {
            array[i] = 10 - i;
        }
        System.out.print("Before: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }


        // task 1A
        //for (int i = 0; i < array.length - 1; i++) {
          //  if (array[i] > array[i + 1]) {
            //    int temp = array[i];
            //    array[i] = array[i + 1];
             //   array[i + 1] = temp;


                for (int i = 1; i < array.length; i++) {
                    counter++;
                    for (int j = 0; j < array.length - i; j++) {
                        counter++;
                        if (array[j] > array[j + 1]) {
                            counter++;
                            int greater = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = greater;











                        }
                    }
                }


        boolean toSort=true;
                for(int i=1; i<array.length && toSort; i++){

                    toSort=false;
                    counter++;
                    for(int j=0;j<array.length-i;  j++){
                        counter++;
                        if(array [j]> array[j+1]){
                            toSort=true;
                            counter++;
                            int greater=array[j];
                            array[j]=array[j+1];
                            array[j+1]=greater;
                            counter++;



                        }
                    }
                }



                System.out.println("\nAfter: ");
                for (int i = 0; i < 10; i++) {
                    System.out.print(array[i] + " ");


                }
            }

        }











