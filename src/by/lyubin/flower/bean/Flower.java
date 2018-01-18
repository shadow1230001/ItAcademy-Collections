package by.lyubin.flower.bean;

public class Flower {
    private String title;
    private Bud bud;
    private Stem stem;

    public Flower(String title, int stemH, int stemW) {
        this.title = title;
        bud = new Bud();
        stem = new Stem(stemH, stemW);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Bud getBud() {
        return bud;
    }

    public void setBud(Bud bud) {
        this.bud = bud;
    }

    public Stem getStem() {
        return stem;
    }

    public void setStem(Stem stem) {
        this.stem = stem;
    }

    public void grow(int newStemH, int newStemW, int newBudSize) {
        stem.setHeight(newStemH);
        stem.setWidth(newStemW);
        bud.setSize(newBudSize);
    }

    public void bloom(int newBudSize, String newBudColor) {
        bud.setSize(newBudSize);
        bud.setColor(newBudColor);
        bud.addFreshLeaf(7, "white", "ellipse");
    }

    public void wither(int newStemH, int newStemW, int newBudSize, String newBudColor) {
        bud.setSize(newBudSize);
        bud.setColor(newBudColor);
        this.stem.setHeight(newStemH);
        this.stem.setWidth(newStemW);
        bud.fallLeaves();


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (title != null ? !title.equals(flower.title) : flower.title != null) return false;
        if (bud != null ? !bud.equals(flower.bud) : flower.bud != null) return false;
        return stem != null ? stem.equals(flower.stem) : flower.stem == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (bud != null ? bud.hashCode() : 0);
        result = 31 * result + (stem != null ? stem.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "title='" + title + '\'' +
                ", bud=" + bud +
                ", stem=" + stem +
                '}';
    }
}
