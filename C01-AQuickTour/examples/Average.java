package examples;

public class Average {

    public static void main(String[] args) {
        int[] values = new int[]{1,2,3,4,5,6,7};
        System.out.println("Average: " + average(values));
    }

    static double average(int[] values) {
        if (values == null || values.length == 0) throw new IllegalArgumentException();
        int sum = 0;
        for (int i = 0; i < values.length; i++) sum += values[i];
        return sum/values.length;
    }


}
