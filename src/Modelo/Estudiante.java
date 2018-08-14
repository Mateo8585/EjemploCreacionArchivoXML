
package Modelo;

import java.io.FileWriter;
import java.util.LinkedList;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


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

    //***********************************************************************************
    
    public Estudiante() {
        
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

    public boolean crearArhicvoXML(LinkedList<Estudiante> listaEstudiantes) {
        
         boolean guardar = false;
        
        try{
            
            Element universidad = new Element("universidad"); //Elemeno raíz principal
            Document doc = new Document(universidad);
            
            for (int i = 0; i < listaEstudiantes.size(); i++) {
                
                Element Estudiante = new Element("Estudiante"); //Elemento raiz para XML
                Estudiante.addContent(new Element ("nombre").setText(listaEstudiantes.get(i).getNombre())); //elemento hijo
                Estudiante.addContent(new Element("Código").setText(listaEstudiantes.get(i).getCodigo())); //elemento hijo
                Estudiante.addContent(new Element("Carrera").setText(listaEstudiantes.get(i).getCarrera())); //elemento hijo
                Estudiante.addContent(new Element("Teléfono").setText(listaEstudiantes.get(i).getTelefono())); //elemento hijo
                Estudiante.addContent(new Element("Dirección").setText(listaEstudiantes.get(i).getDireccion())); //elemento hijo
                Estudiante.addContent(new Element("Documento").setText(listaEstudiantes.get(i).getDocumento())); //elemento hijo 
                
//              Estudiante.addContent(new Element("Edad").setText( "" + listaEstudiantes.get(i).getEdad())); //elemento hijo

                String edad = Integer.toString(listaEstudiantes.get(i).getEdad());
                Estudiante.addContent(new Element("Edad").setText(edad)); //elemento hijo
                
                doc.getRootElement().addContent(Estudiante); //Guardamos el archivo XML al documento
                
            }
            
            //Se cierra el proceso de guadardo del archivo XML
            
            XMLOutputter xmlOutput = new XMLOutputter(); 
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(doc, new FileWriter("universidad.xml"));
            
            guardar = true; 
            System.out.println("ARCHIVO GUARDADO");
        
        }catch (Exception e){
            
         System.out.println(e.getMessage());
         guardar = false;
            
        } //Fin del try       
         
         return guardar; 
               
    }

}
