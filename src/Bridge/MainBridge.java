package Bridge;
public class MainBridge {
    public static void main(String[] args) {
        Oficina oficinaBogota = new Oficina();
        ClasificadorPaquetes clasificador = new ClasificadorPaquetes(oficinaBogota);
        Paquete paquete1 = new Paquete("Paquete 1", 5, "Fontibon", "Cedritos", true);
        Paquete paquete2 = new Paquete("Paquete 2", 2, "Kenedy", "Chia", false);
        clasificador.clasificarPaquete(paquete1);
        clasificador.clasificarPaquete(paquete2);
    }
}
