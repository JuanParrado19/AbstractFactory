package Bridge;
public class Oficina implements Mensajeria {
    @Override
    public void enviarPaquete(String nombre, float peso, String origen, String destino) {
        System.out.println("El paquete " + nombre + " con peso " + peso + " kg, de " + origen + " a " + destino + " ha sido enviado.");
    }
    @Override
    public void devolverPaquete(String nombre, float peso, String origen, String destino) {
        System.out.println("El paquete " + nombre + " con peso " + peso + " kg, de " + origen + " a " + destino + " ha sido devuelto.");
    }
}
