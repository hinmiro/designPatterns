package iterator;

import java.math.BigInteger;
import java.util.Iterator;

public class FibonacciIterator implements Iterator<BigInteger>{
    private BigInteger current = BigInteger.ZERO;
    private BigInteger next = BigInteger.ONE;


    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public BigInteger next() {
        BigInteger temp = current;
        current = next;
        next = temp.add(next);
        return temp;
    }
}
