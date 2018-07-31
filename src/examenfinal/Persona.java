package examenfinal;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Persona extends Thread{

    private String nombre;
    private ArrayList<Cliente> clientes = new ArrayList();
    private boolean ocupado=false;
    
    public Persona(String nombre ){
        this.nombre = nombre;
    }
    
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void run(){
        if(!ocupado){
            ocupado = true;
            for (int i = 0; i < clientes.size(); i++) {
                if(clientes.get(i).isCompletado()){
                    try {
                        Thread.sleep(clientes.get(i).getVehiculo().getTiempoTotal()*1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    clientes.get(i).setCompletado(false);
                }
            }
            ocupado=false;
        }
        this.interrupt();
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}
