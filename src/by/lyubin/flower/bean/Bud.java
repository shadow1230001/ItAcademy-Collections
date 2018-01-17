package by.lyubin.flower.bean;

public class Bud {
    private int size;
    private String color;
    private Leaf[] leaves;

    private static final String DEFAULT_BUD_COLOR = "green";
    private static final int DEFAULT_BUD_SIZE = 1;

    Bud() {
        color = DEFAULT_BUD_COLOR;
        size = DEFAULT_BUD_SIZE;
    }

    public Leaf[] getLeaves() {
        return leaves;
    }

    public int getSize() {
        return size;
    }

    void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    void addFreshLeaf(int leafNumber, String leafColor, String leafShape) {

        if (leaves == null) {
            leaves = new Leaf[leafNumber];
            for (int i = 0; i < leafNumber; i++) {
                leaves[i] = new Leaf(leafColor, leafShape);
            }
        }

    }

    void fallLeaves() {
        if (leaves != null) {
            for (int i = 0; i < leaves.length; i++) {
                if (i % 2 == 0) {
                    leaves[i].setColor("brown");
                } else {
                    leaves[i] = null;
                }
            }
        }

    }
}
