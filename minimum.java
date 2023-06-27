public class minimum{
    public static void main(String[] args){

        int givenSequence[] = {4, 5, 3, 6, 2, 8, 1, 0};

        int min = givenSequence[0];

        for (int i = 0; i <= 7; i++) {
            if (givenSequence[i] < min){
                min = givenSequence[i];
            }
        }

        System.out.println("The smallest value in the sequence is " + min);

    }
}