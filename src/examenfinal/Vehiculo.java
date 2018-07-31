package examenfinal;

import java.util.ArrayList;

public class Vehiculo {
    
    private ArrayList<String> servicios = new ArrayList();
    private String tipo;
    private int tiempoTotal;
    
    public void agregarServicio(String a){
        servicios.add(a);
    }
    
    public Vehiculo(String tipo){
        this.tipo = tipo;
    }

    public ArrayList<String> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<String> servicios) {
        this.servicios = servicios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void calcularTiempo(){
        for (int i = 0; i < servicios.size(); i++) {
            if(tipo.equals("Sedan")){
                if(servicios.get(i).equals("Lavado"))tiempoTotal+=3;
                if(servicios.get(i).equals("Aspirado"))tiempoTotal+=2;
                if(servicios.get(i).equals("Siliconeado"))tiempoTotal+=4;
            }
            if(tipo.equals("PickUp")){
                if(servicios.get(i).equals("Lavado"))tiempoTotal+=4;
                if(servicios.get(i).equals("Aspirado"))tiempoTotal+=1;
                if(servicios.get(i).equals("Siliconeado"))tiempoTotal+=3;
            }
            if(tipo.equals("Camioneta")){
                if(servicios.get(i).equals("Lavado"))tiempoTotal+=5;
                if(servicios.get(i).equals("Aspirado"))tiempoTotal+=3;
                if(servicios.get(i).equals("Siliconeado"))tiempoTotal+=4;
            }
            if(tipo.equals("Pesado")){
                if(servicios.get(i).equals("Lavado"))tiempoTotal+=6;
                if(servicios.get(i).equals("Aspirado"))tiempoTotal+=3;
                if(servicios.get(i).equals("Siliconeado"))tiempoTotal+=3;
            }
        }
    }
    
    public String getServiciosTexto(){
        String cadena="";
        if(servicios.size()==1) cadena = servicios.get(0);
        if(servicios.size()==2) cadena = servicios.get(0)+" y "+servicios.get(1);
        if(servicios.size()==3) cadena = servicios.get(0)+", "+servicios.get(1)+" y "+servicios.get(2);
        return cadena;
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }
    
}
