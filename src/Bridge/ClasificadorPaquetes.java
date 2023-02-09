package Bridge;
public class ClasificadorPaquetes {
    public Mensajeria mensajeria;
    ClasificadorPaquetes(Mensajeria mensajeria) {
        this.mensajeria = mensajeria;
    }
    void clasificarPaquete(Paquete paquete) {
        if (paquete.estado) {
            mensajeria.enviarPaquete(paquete.nombre, paquete.peso, paquete.origen, paquete.destino);
        } else {
            mensajeria.devolverPaquete(paquete.nombre, paquete.peso, paquete.origen, paquete.destino);
        }
    }
}
