package tree;

/**
 * Created by veter on 04.04.15.
 */
public interface Tree {

    boolean add(Comparable node);

    boolean remove(Comparable node);

    int height();

    int size();

    boolean contains(Comparable node);

}
