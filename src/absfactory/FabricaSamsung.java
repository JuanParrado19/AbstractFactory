package absfactory;

public class FabricaSamsung implements Fabrica{

    @Override
    public Silla crearMueble() {
        return new SillaSamsung();
    }

    @Override
    public Nevera crearElectrodomestico() {
        return new NeveraSamsung();
    }
}
