package iterator;

import java.math.BigInteger;
import java.util.Iterator;

public interface Sequence {
    Iterator<BigInteger> iterator();
}
