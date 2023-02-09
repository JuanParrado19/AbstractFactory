package Bridge;
public interface Mensajeria {
    void enviarPaquete(String nombre, float peso, String origen, String destino);
    void devolverPaquete(String nombre, float peso, String origen, String destino);

}
