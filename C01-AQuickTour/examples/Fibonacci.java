package examples;

class Fibonacci {
	private static int ITERATIONS = 9;
	private static int[] SEQUENCE = new int[ITERATIONS];

	public static void main(String[] args) {
		for (int i = 0; i < ITERATIONS; i++) {
			SEQUENCE[i] = fib(i);
		}
		printSequence();
	}

	static int fib(int n) {
		if (n <= 1) return n;
		return fib(n-1) + fib(n-2);
	}

	public static void printSequence() {
		System.out.println("Sequence: ");
		for (int i = 0; i < SEQUENCE.length; i++) System.out.println(SEQUENCE[i]);
	}
}
