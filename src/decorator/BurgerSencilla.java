package decorator;

public class BurgerSencilla implements Burger {
    public void mostrarIngredientes() {
        System.out.println("Hamburguesa con: ");
        this.a├▒adirIngredientes();
    }
    private void a├▒adirIngredientes() {
        System.out.println("Pan, carne, queso, lechuga y tomate");
    }
}
