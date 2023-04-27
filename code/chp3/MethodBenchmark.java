package chp3;

class MethodBenchmark extends Benchmark {

    /** Do nothing, just return. */
    void benchmark() {}

    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        long time = new MethodBenchmark().repeat(count);
        System.out.println(count + " methods in " + time + " nanoseconds");
    }

}
