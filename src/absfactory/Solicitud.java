package absfactory;

public class Solicitud {
    private Silla silla = new SillaApple();

    private Nevera nevera = new NeveraSamsung();

    public void SolicitudApple(){
        Fabrica fabrica = new FabricaApple();

        Nevera nevera = fabrica.crearElectrodomestico();
        Silla silla = fabrica.crearMueble();

        silla.construirSilla();
        nevera.ConstruirNevera();


    }

    public void SolicitudSamsung(){

        Fabrica fabrica = new FabricaSamsung();

        Nevera nevera = fabrica.crearElectrodomestico();
        Silla silla = fabrica.crearMueble();

        silla.construirSilla();
        nevera.ConstruirNevera();
    }

}
