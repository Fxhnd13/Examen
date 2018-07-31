package examenfinal;

public class Cliente {

    private String nombre;
    private Vehiculo vehiculo;
    private boolean completado=true;

    public Cliente(String nombre, Vehiculo vehiculo){
        this.nombre = nombre;
        this.vehiculo = vehiculo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
    
}
