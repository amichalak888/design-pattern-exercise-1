package pizza;

import java.util.List;

public abstract class Pizza {
    private double cost;
    private List<String> components;

    public Pizza(double cost, List<String> components) {
        this.cost = cost;
        this.components = components;


    }
}
