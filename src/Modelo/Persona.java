
package Modelo;

import java.io.Serializable;


public class Persona implements Serializable{
    
    private String Telefono;
    private String Direccion;
    private String Documento;
    private int Edad;
    
    //***********************************************************************************
    
    public Persona(String Telefono, String Direccion, String Documento, int Edad){
        
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Documento = Documento;
        this.Edad = Edad;
        
    }
    
    //***********************************************************************************

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    //***********************************************************************************

    @Override
    public String toString() {
        return  "Teléfono: " + Telefono + ", Dirección: " + Direccion + ", Documento: " + Documento + ", Edad: " + Edad;
    }
     
}
