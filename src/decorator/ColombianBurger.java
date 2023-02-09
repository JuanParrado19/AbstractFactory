package decorator;

public class ColombianBurger extends BurgerDecorator {
    public ColombianBurger(Burger burger) {
        super(burger);
    }

    @Override
    public void mostrarIngredientes() {
        super.mostrarIngredientes();
        System.out.println("Ademas de los ingrenientes especiales de la hamburgesa Colombiana:");
        this.añadirSalsa();
        this.añadirPatacon();
    }

    private void añadirSalsa() {
        System.out.println(" suero costeño");
    }

    private void añadirPatacon() {
        System.out.println(" patacones");
    }
}
