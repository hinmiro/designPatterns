package iterator;

import java.math.BigInteger;
import java.util.Iterator;

public class FibonacciSequence implements Sequence {

    @Override
    public Iterator<BigInteger> iterator() {
        return new FibonacciIterator();
    }
}
