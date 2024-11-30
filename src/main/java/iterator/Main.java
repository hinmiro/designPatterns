package iterator;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence seq = new FibonacciSequence();
        Iterator iterator = seq.iterator();

        for (int i = 0; i < 200; i++) {
            System.out.println(iterator.next());
        }
    }
}
