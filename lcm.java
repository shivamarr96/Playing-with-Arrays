import java.util.Arrays;

public class LCM {

    private static double LCM = 1;

    private static int returnMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] != 1 && array[i] < min) {
                min = array[i];
            }
        }
        return min; //When this returns Integer.MAX_VALUE, we are done
    }

    private static int returnFirstDivisor(int val) {
        if (val == Integer.MAX_VALUE) {
            return -1; //Return -1 to signal end
        } else {
            for (int i = 2; i <= val; ++i) {
                if (val % i == 0) {
                    LCM *= i;
                    System.out.print(i+" ");
                    return i;
                }
            }
        }
        System.err.println("Unnecessary return!");
        return -10;
    }

    public static void main(String[] args) {

        //Your numbers here
        int array[] = new int[]{9, 14, 21, 99};

        while (true) {
            int minDivisor = returnFirstDivisor(returnMinValue(array)); 
            if (minDivisor == -1) break; 
            
            for (int i = 0; i < array.length; ++i) {
                if (array[i] % minDivisor == 0) {
                    array[i] /= minDivisor;
                }
            }
            System.out.print(Arrays.toString(array)+"\n");
        }
        System.out.println("LCM = " + LCM); 
    }
}