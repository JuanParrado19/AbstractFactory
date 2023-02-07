package abstractfactory;

public class Solicitud {
    private Silla silla = new SillaApple();

    private Nevera nevera = new NeveraSamsung();

    public Solicitud(){
        nevera.ConstruirNevera();
        silla.construirSilla();
    }

}
