class Beverage {
    public void prepare() {
        System.out.println("Preparing beverage...");
    }

    public void serve() {
        System.out.println("Serving beverage...");
    }
}

class Coffee extends Beverage {
    @Override
    public void prepare() {
        System.out.println("Brewing coffee beans...");
    }

    @Override
    public void serve() {
        System.out.println("Serving hot coffee...");
    }
}

class Tea extends Beverage {
    @Override
    public void prepare() {
        System.out.println("Steeping tea leaves...");
    }

    @Override
    public void serve() {
        System.out.println("Serving hot tea...");
    }
}

class Smoothie extends Beverage {
    @Override
    public void prepare() {
        System.out.println("Blending fruits and yogurt...");
    }

    @Override
    public void serve() {
        System.out.println("Serving chilled smoothie...");
    }
}

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        Smoothie smoothie = new Smoothie();

        coffee.prepare();
        coffee.serve();

        tea.prepare();
        tea.serve();

        smoothie.prepare();
        smoothie.serve();
    }
}
