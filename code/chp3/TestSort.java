package chp3;

public class TestSort {

    static double[] testData = { 0.3, 1.3e-2, 7.9, 3.17 };
    static String[] testString = { "x", "hi", "z", "a" };
    static Integer[] testInt = { 6, 3, 8, 1 };

    public static void main(String[] args) {
//        SortDouble bsort = new SimpleSortDouble();
//        SortMetrics metrics = bsort.sort(testData);
//        System.out.println("Metrics: " + metrics);
//        for (int i = 0; i < testData.length; i++) {
//            System.out.println("\t" + testData[i]);
//        }

        SortObject<String> stringSort = new SimpleSortObject<>();
        SortMetrics stringMetrics = stringSort.sort(testString);
        System.out.println("String Metrics: " + stringMetrics);
        for (int i = 0; i < testString.length; i++) {
            System.out.println("\t" + testString[i]);
        }

        SortObject<Integer> intSort = new SimpleSortObject<>();
        SortMetrics intMetrics = intSort.sort(testInt);
        System.out.println("Int Metrics: " + stringMetrics);
        for (int i = 0; i < testInt.length; i++) {
            System.out.println("\t" + testInt[i]);
        }
    }

}
