public class Fibonacci {
    public static void main(String[] args){

        int i = 0;

        int[] fibArray = new int[20];

        while (i < 20){
            if (i > 1) { // applying the sequence after 0,1

                int var1 = i - 1;
                int var2 = i - 2;

                fibArray[i] = fibArray[var1] + fibArray[var2];

            }
            else {
                fibArray[i] = i;
            }

            System.out.print(fibArray[i]);

            if (i < 19){
                System.out.println(",");
            }

            i++;


        }
    }
}
