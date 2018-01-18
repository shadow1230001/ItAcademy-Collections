package by.lyubin.flower.bean;

import java.util.Arrays;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bud bud = (Bud) o;

        if (size != bud.size) return false;
        if (color != null ? !color.equals(bud.color) : bud.color != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(leaves, bud.leaves);
    }

    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(leaves);
        return result;
    }

    @Override
    public String toString() {
        return "Bud{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", leaves=" + Arrays.toString(leaves) +
                '}';
    }
}
