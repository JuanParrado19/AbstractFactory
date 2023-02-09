package decorator;

public class Menu {

    public void mostrarMenu() {
        System.out.println("El menu de hoy es:");
        System.out.println("\n #1:");
        Burger BurgerSencilla = new BurgerSencilla();
        BurgerSencilla.mostrarIngredientes();
        System.out.println("\n #2: ");
        Burger BeaconBurger = new BeaconBurger(new BurgerSencilla());
        BeaconBurger.mostrarIngredientes();
        System.out.println("\n #3: ");
        Burger ColombianBurger = new ColombianBurger(new BurgerSencilla());
        ColombianBurger.mostrarIngredientes();
        System.out.println("\n Combo #1:");
        Burger ComboBurger = new ComboBurger(new BurgerSencilla());
        ComboBurger.mostrarIngredientes();
        System.out.println("\n Combo #2:");
        Burger ComboBeaconBurger = new ComboBurger(new BeaconBurger(new BurgerSencilla()));
        ComboBeaconBurger.mostrarIngredientes();
    }
}
