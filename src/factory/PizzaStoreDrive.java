package factory;

public class PizzaStoreDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        Pizza pizza1 = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza1.getName() + "\n");
    }
}
