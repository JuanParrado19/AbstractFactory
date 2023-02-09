package decorator;

public class BurgerDecorator implements Burger {
    private Burger burger;
    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }
    @Override
    public void mostrarIngredientes() {
        this.burger.mostrarIngredientes();
    }
}

