package by.lyubin.flower.bean;

public class Stem {
    private int height;
    private int width;

    Stem(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stem stem = (Stem) o;

        if (height != stem.height) return false;
        return width == stem.width;
    }

    @Override
    public int hashCode() {
        int result = height;
        result = 31 * result + width;
        return result;
    }

    @Override
    public String toString() {
        return "Stem{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}

