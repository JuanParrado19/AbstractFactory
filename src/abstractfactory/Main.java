package abstractfactory;

public class Main {
    public static void main(String[] args) {

       Solicitud();


    }

    static void Solicitud(){
        Fabrica fabrica = new FabricaSamsung();

        Nevera nevera = fabrica.crearElectrodomestico();
        Silla silla = fabrica.crearMueble();

        silla.construirSilla();
        nevera.ConstruirNevera();

    }
}
