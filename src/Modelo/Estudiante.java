
package Modelo;


public class Estudiante extends Persona{
    
    String Nombre;
    String Codigo;
    String Carrera;
    
    //**********************************************************************************************************************************
    
    public Estudiante(String Nombre, String Codigo, String Carrera, String Telefono, String Direccion, String Documento, int Edad){
        super(Telefono, Direccion, Documento, Edad);
        
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Carrera = Carrera;
    }
    
    //**********************************************************************************************************************************

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
    //**********************************************************************************************************************************

    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", Código: " + Codigo + ", Carrera: " + Carrera + ", " + super.toString();
    }

}
