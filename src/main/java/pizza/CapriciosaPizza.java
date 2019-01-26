package pizza;

import java.util.Arrays;
import java.util.List;

public class CapriciosaPizza extends Pizza {
    private double cost;
    private List<String> components;

    public CapriciosaPizza(double cost, List<String> components) {
        super(cost, components);
    }

//    public CapriciosaPizza() {
//        components = Arrays.asList("Cheese", "Ham", "Champignons");
//        cost = 29.00;


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public void showPizzaInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "CapriciosaPizza{" +
                "cost=" + cost +
                ", components=" + components +
                '}';
    }
}
