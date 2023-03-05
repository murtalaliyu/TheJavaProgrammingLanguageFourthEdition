package exercises._1_10;

import exercises.FibonacciValue;

import java.util.Locale;

public class Exercise_1_10_ImprovedFibonacci {
    static final int MAX_INDEX = 9;
    static final FibonacciValue[] SEQUENCE = new FibonacciValue[MAX_INDEX];

    /**
     * Print out the first few Fibonacci numbers,
     * marking evens with a '*'
     */
    public static void main(String[] args) {
        int lo = 1; SEQUENCE[0] = new FibonacciValue(lo, lo%2==0);
        int hi = 1; SEQUENCE[1] = new FibonacciValue(hi, hi%2==0);

        for (int i = 2; i < MAX_INDEX; i++) {
            hi = lo + hi;
            lo = hi - lo;
            SEQUENCE[i] = new FibonacciValue(hi, hi%2==0);
        }

        printValues();
    }

    public static void printValues() {
        String mark;
        for (int i = 0; i < SEQUENCE.length; i++) {
            if (SEQUENCE[i].getIsEven()) mark = " *";
            else mark = "";

            //System.out.println(i+1 + ": " + SEQUENCE[i].getValue() + mark);
            System.out.printf(Locale.GERMAN, "%.2f%s\n", (float)SEQUENCE[i].getValue(), mark);   // Exercise 1.13
        }
    }

}
