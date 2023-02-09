package decorator;

public class ComboBurger extends BurgerDecorator {
    public ComboBurger(Burger burger) {
        super(burger);
    }

    @Override
    public void mostrarIngredientes() {
        super.mostrarIngredientes();
        System.out.println("Acompañada de:");
        this.añadirBebidaYPapas();
    }

    private void añadirBebidaYPapas() {
        System.out.println(" Papas en cascos y gaseosa");
    }
}

