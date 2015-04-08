package tree;

import tree.binary.BinaryTree;

/**
 * Created by veter on 04.04.15.
 */
public class TreeTest {

    public static class IntVal implements Comparable {

        public final int value;

        public IntVal(int value) {
            this.value = value;
        }

        @Override
        public int compareTo(Comparable other) {
            if(other instanceof IntVal) {
                return value - ((IntVal)other).value;
            } else
                throw new RuntimeException("Unexpected state");
        }

        public String toString() {
            return "" + value;
        }
    }


    public static void main(String... args) {
        IntVal[] vals = new IntVal[]{
                new IntVal(13),
                new IntVal(7),
                new IntVal(12),
                new IntVal(1),
                new IntVal(15),
                new IntVal(3),
                new IntVal(5),
                new IntVal(10),
                new IntVal(4)
        };

        Tree tree = new BinaryTree();
        for(IntVal v : vals)
            tree.add(v);

        System.out.println(tree);
    }

}
