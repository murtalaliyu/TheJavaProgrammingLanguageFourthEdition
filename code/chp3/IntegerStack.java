package chp3;

/** DANGEROUS cloning example (we must clone all object references as well) */
public class IntegerStack implements Cloneable {

    private int[] buffer;
    private int top;

    public IntegerStack(int maxContents) {
        buffer = new int[maxContents];
        top = -1;
    }

    public void push(int val) {
        buffer[++top] = val;
    }

    public int pop() {
        return buffer[top--];
    }

    public IntegerStack clone() {
        try {
            IntegerStack nObj = (IntegerStack) super.clone();
            nObj.buffer = buffer.clone();
            return nObj;
        } catch (CloneNotSupportedException e) {
            // Cannot happen -- we support clone, and so do arrays
            throw new InternalError(e.toString());
        }
    }

    static void printBuffer(int[] buffer, String name) {
        System.out.print(name + ": ");
        for (int i = 0; i < buffer.length; i++) System.out.print(buffer[i] + " | ");
        System.out.println();
    }

    public static void main(String[] args) {
        IntegerStack first = new IntegerStack(2);
        first.push(2);
        first.push(9);

        IntegerStack second = first.clone();

        first.pop();
        first.push(17);

        printBuffer(first.buffer, "First");
        printBuffer(second.buffer, "Second");
    }

}
