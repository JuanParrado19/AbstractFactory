package abstractfactory;

public class SillaSamsung implements Silla{
    @Override
    public String toString() {
        return "SillaSamsung";
    }

    @Override
    public void construirSilla() {
        System.out.println("Se ha Creado la Silla de la marca Samsung");
    }
}
