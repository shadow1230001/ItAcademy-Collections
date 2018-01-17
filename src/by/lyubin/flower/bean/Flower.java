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


}
