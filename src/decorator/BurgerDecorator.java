package decorator;

public class BurgerDecorator implements Burger {
    private Burger burger;
    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }
    @Override
    public void mostrarMenu() {
        this.burger.mostrarMenu();
    }
}

