package by.lyubin.flower.logick;

import java.util.HashMap;
import java.util.Random;

public class FortuneTeller {
    private HashMap<Integer, String> mass = new HashMap<Integer, String>();
    private int chamomileCountLeaves = 3;

    public FortuneTeller() {
        mass.put(1, " убьет ");
        mass.put(2, " не убьет ");
        mass.put(3, " сам умру ");

        mass.put(4, " даст машину ");
        mass.put(5, " не даст машину ");
        mass.put(6, " подарит машину ");

        mass.put(7, " закончу курсы ");
        mass.put(8, " не закончу курсы ");
        mass.put(9, " закончу и возьмут в епам ");
        this.mass = mass;
    }

    private int randomTeller() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

    public String teller() {

        return this.mass.get(this.randomTeller());

    }
}



