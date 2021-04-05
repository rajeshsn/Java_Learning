package decoratorPattern;

public class StartbucksCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Expresso();

        System.out.println(beverage.getDescription() + "  "+" $ "+beverage.cost());

        Beverage beverage1 = new Expresso();
        beverage1 = new Mocha(beverage1);

        System.out.println(beverage1.getDescription() +" "+ "$"+beverage1.cost());
    }
}
