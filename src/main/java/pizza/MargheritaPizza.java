package pizza;

import java.util.Arrays;
import java.util.List;

public class MargheritaPizza extends Pizza {

    private double cost;
    private List<String> components;

//    public MargheritaPizza() {

//        components = Arrays.asList("Cheese", "Oregano");
//        cost = 24.00;


    public MargheritaPizza( double cost, List<String > components){
            super(cost, components);
        }

        public double getCost () {
            return cost;
        }

        public void setCost ( double cost){
            this.cost = cost;
        }

        public List<String> getComponents () {
            return components;
        }

        public void setComponents (List < String > components) {
            this.components = components;
        }

        public void showPizzaInfo () {
            System.out.println(this.toString());
        }


        @Override
        public String toString () {
            return "MargheritaPizza{" +
                    "cost=" + cost +
                    ", components=" + components +
                    '}';
        }
    }
