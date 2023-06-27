public class middle {
    public static int[] findMiddleNumber (int[] arr) {
        int midpoint = arr.length / 2;

        if (arr.length % 2 == 1 ) {
            int[] result = new int[1];
            result[0] = arr[midpoint];
            return result;
        }
        else {
            int[] result = new int[2];
            result[0] = arr[midpoint - 1];
            result[1] = arr[midpoint];
            return result;
        }

    }


    public static void main (String[] args) {

        int[] sequence = {2, 4, 6, 8, 10, 34, 87, 10, 20};
        int[] middleNumber = findMiddleNumber(sequence);

        System.out.println("Middle number/numbers: ");
        for (int middle : middleNumber) {
            System.out.println(middle);
        }
    }
}
