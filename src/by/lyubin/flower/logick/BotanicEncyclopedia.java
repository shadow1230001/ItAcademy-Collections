package by.lyubin.flower.logick;

import by.lyubin.flower.bean.Bud;
import by.lyubin.flower.bean.Flower;
import by.lyubin.flower.bean.Leaf;

public class BotanicEncyclopedia {
    public void printFlowerInfo(Flower flower) {

        if (flower != null) {
            System.out.println("Title: " + flower.getTitle());
            System.out.println("bud size, color: " + flower.getBud().getSize()
                    + "" + flower.getBud().getColor());
            System.out.println("stem h, w: " + flower.getStem().getHeight()
                    + "" + flower.getStem().getWidth());
            printLeaves(flower.getBud());
        }
    }

    private void printLeaves(Bud bud) {
        if (bud != null) {
            Leaf[] leaves = bud.getLeaves();
            if (leaves != null) {
                for (Leaf leaf : leaves) {
                    if (leaf != null) {
                        System.out.println("leaf color, shape:  " + leaf.getColor() + ", " + leaf.getShape());
                    } else {
                        System.out.println(" Leaf fall");
                    }
                }

            } else if (bud != null) {
                System.out.println("Leaves still not appear");
            }
        }
    }
}
