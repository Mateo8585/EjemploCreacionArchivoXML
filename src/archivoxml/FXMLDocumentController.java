/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoxml;

import Modelo.Estudiante;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author mateo.olaya
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private  Label nombre;
    
    @FXML
    private  Label codigo;
    
    @FXML
    private  Label carrera;
    
    @FXML
    private  Label telefono;
    
    @FXML
    private  Label direccion;
    
    @FXML
    private  Label documento;
    
    @FXML
    private  Label edad;
    
    //**************************************
    
    @FXML
    private  TextField Tnombre;
    
    @FXML
    private  TextField Tcodigo;
    
    @FXML
    private  TextField Tcarrera;
    
    @FXML
    private  TextField Ttelefono;
    
    @FXML
    private  TextField Tdireccion;
    
    @FXML
    private  TextField Tdocumento;
    
    @FXML
    private  TextField Tedad;
    
    LinkedList<Estudiante> listaEstudiantes;
    
    //***************************************
    
    @FXML
    private void AgregarEstudiante(ActionEvent event) {
        
        String Nombre = Tnombre.getText();
        String codigo = Tcodigo.getText();
        String carrera = Tcarrera.getText();
        String telefono = Ttelefono.getText();
        String direccion = Tdireccion.getText();
        String documento = Tdocumento.getText();
        int edad = Integer.parseInt(Tedad.getText());
        
        Estudiante E = new Estudiante(Nombre, codigo, carrera, telefono, direccion, documento, edad);
        listaEstudiantes.add(E);
        
        Tnombre.setText("");
        Tcodigo.setText("");
        Tcarrera.setText("");
        Ttelefono.setText("");
        Tdireccion.setText("");
        Tdocumento.setText("");
        Tedad.setText("");
   
    }
    
    @FXML
    private void GuardarXML(ActionEvent e){
        
       Estudiante objeV = new Estudiante(); 
        
        boolean guardar = objeV.crearArhicvoXML(listaEstudiantes); //Establece el llamado del método crear.. que está en la clase estudiante
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //Se crea aquí como si fuera el constructor de esta clase
        listaEstudiantes = new LinkedList(); 
        
    }    
    
}
