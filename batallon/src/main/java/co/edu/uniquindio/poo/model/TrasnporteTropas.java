package co.edu.uniquindio.poo.model;

public class TrasnporteTropas extends Vehiculo {
    private int capacdidadSoldados;
    public TrasnporteTropas(String id, String modelo, String fechaFabricacion, int kilometraje, EstadoOperativo estadoOperativo, int capacdidadSoldados,int misiones) {
        super (id,modelo,fechaFabricacion,kilometraje,estadoOperativo,misiones);
        this.capacdidadSoldados = capacdidadSoldados;

    }

    public int getCapacdidadSoldados() {

        return capacdidadSoldados;
    }

    public void setCapacdidadSoldados(int newCapacdidadSoldados) {

        this.capacdidadSoldados = newCapacdidadSoldados;
    }


}
