package abstractfactory;

public class FabricaApple implements Fabrica{
    @Override
    public Silla crearMueble() {
        return new SillaApple();
    }

    @Override
    public Nevera crearElectrodomestico() {
        return new NeveraApple();
    }
}
