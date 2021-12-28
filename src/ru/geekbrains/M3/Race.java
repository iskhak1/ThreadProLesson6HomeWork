package ru.geekbrains.M3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Race {
    private Vector<Stage> stages;
    public Vector<Stage> getStages() { return stages; }
    public Race(Stage... stages) {
        this.stages = new Vector<Stage>(Arrays.asList(stages));
    }
}
