package Bridge;
public class Paquete {
    public String nombre;
    public float peso;
    public String origen;
    public String destino;
    public boolean estado;
    Paquete(String nombre, float peso, String origen, String destino, boolean estado) {
        this.nombre = nombre;
        this.peso = peso;
        this.origen = origen;
        this.destino = destino;
        this.estado = estado;
    }
}
