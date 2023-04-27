package chp3;

class ParameterBenchmark extends Benchmark {

    void benchmark() {}

    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) new ParameterBenchmark().benchmark();
        double time = (double) (System.nanoTime() - start) / 1000000000.0;
        System.out.println(count + " methods in " + time + " seconds");
    }

}
