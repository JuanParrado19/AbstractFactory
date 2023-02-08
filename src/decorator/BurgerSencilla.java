package decorator;

public class BurgerSencilla implements Burger {
    public void mostrarMenu() {
        System.out.println("Hamburguesa con: ");
        this.añadirIngredientes();
    }
    private void añadirIngredientes() {
        System.out.println("Pan, carne, queso, lechuga y tomate");
    }
}
