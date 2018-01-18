package by.lyubin.flower.bean;

public class Leaf {
    private String color;
    private String shape;

    Leaf(String color, String shape) {
        this.color = color;
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Leaf leaf = (Leaf) o;

        if (color != null ? !color.equals(leaf.color) : leaf.color != null) return false;
        return shape != null ? shape.equals(leaf.shape) : leaf.shape == null;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (shape != null ? shape.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }
}
