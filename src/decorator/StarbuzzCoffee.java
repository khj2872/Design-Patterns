package decorator;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage decaf = new Decaf();
        decaf = new Soy(decaf);
        decaf = new Mocha(decaf);
        decaf = new Whip(decaf);
        System.out.println(decaf.getDescription() + " $" + decaf.cost());
    }
}
