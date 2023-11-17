public class tas1_exercise5 {
    public static void main(String[] args) {
        int[] Array = new int[10];

        for (int value = 0; value < Array.length; value++) {
            Array[value] = 9 - value;

        }
        for (int result : Array) {
            System.out.println(result);




        }

    }
}



