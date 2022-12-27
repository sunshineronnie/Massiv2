public class Arr {

    public static void main(String[] args) {

        int[] myArray = generateRandomArray();

        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];

        }
        System.out.println(" A sum of spending in month " + sum);
        System.out.println();

        int min = myArray[0];
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (min > myArray[i]) {
                min = myArray[i];
            } else if (max < myArray[i]) {
                max = myArray[i];
            }
        }
        System.out.println(" min spending sum in a day " + min + ", " + " max spending sum in a day " + max);


        double average = (double) sum / myArray.length;
        System.out.println(" average spending sum in a day " + average);


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);

        }
    }



    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;



    }





}



