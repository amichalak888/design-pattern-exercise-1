package pizza;

import java.util.List;

public class SimpleFactory {

    public Pizza create(PizzaType pizzaType, double price, List<String> components) {
        if (PizzaType.MARGHERITA.equals(pizzaType)) {
            return new MargheritaPizza(price, components);
        } else if (PizzaType.HAWAI.equals(pizzaType)) {
            return new HawaiPizza(price, components);
        } else if (PizzaType.CAPRICIOSA.equals(pizzaType)) {
            return new CapriciosaPizza(price, components);
        } else if (PizzaType.FUNGHI.equals(pizzaType)) {
            return new FunghiPizza(price, components);
        }
        return null;
    }}