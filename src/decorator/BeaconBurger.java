package decorator;

public class BeaconBurger extends BurgerDecorator {
    public BeaconBurger(Burger burger) {
        super(burger);
    }

    @Override
    public void mostrarIngredientes() {
        super.mostrarIngredientes();
        System.out.println("Ademas de los ingrenientes especiales de la hamburgesa Beacon:");
        this.añadirBeacon();
        this.añadirCebolla();
    }

    private void añadirBeacon() {
        System.out.println(" tocineta");
    }

    private void añadirCebolla() {
        System.out.println(" cebolla grille");
    }
}

