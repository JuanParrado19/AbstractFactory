package abstractfactory;

public class SillaApple implements Silla {
    @Override
    public void construirSilla() {
        System.out.println("Se ha Construidio una silla Apple");
    }
}
