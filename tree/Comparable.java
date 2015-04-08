package tree;

/**
 * Created by veter on 04.04.15.
 */
public interface Comparable {

    /**
     * Compares this object with other
     * @param other
     * @return -1 if this < other, 0 if this.equals(other), 1 if this > other
     */
    int compareTo(Comparable other);

}
