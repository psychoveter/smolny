package ttt.model;

/**
 * Created by veter on 18.04.15.
 */
public class TTTModel {

    public static final String CROSS = "cross";
    public static final String ZERO = "zero";

    private String state = CROSS;

    private String[][] data = new String[][] {
            {null, null, null},
            {null, null, null},
            {null, null, null}
    };

    private int[][] solution = null;
    // e.g. main diag: {{0,0}, {1,1}, {2,2}}

    public String get(int x, int y) {
        return data[x][y];
    }

    public void set(String val, int x, int y) {
        data[x][y] = val;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setSolution(int x1, int y1, int x2, int y2,int x3, int y3 ) {
        solution = new int[][] {
                {x1,y1}, {x2,y2}, {x3, y3}
        };
    }

    public boolean isFinished() {
        return solution != null;
    }
}
