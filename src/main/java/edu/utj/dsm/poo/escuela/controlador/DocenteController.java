// Morones Torres Jorge Arnulfo
package edu.utj.dsm.poo.escuela.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class DocenteController extends FormularioBase {

    @FXML private TextField txtNombre;
    @FXML private TextField txtApellido;
    @FXML private TextField txtTelefono;
    @FXML private TextField txtEdad;
    @FXML private TextField txtRfc;
    @FXML private TextField txtNumDocente;
    @FXML private ComboBox<String> cmbEspecialidad;
    @FXML private Label lblErrorNombre, lblErrorApellido, lblErrorTelefono, lblErrorEdad, lblErrorRfc, lblErrorNumDocente, lblErrorEspecialidad;

    @Override
    protected void configurar() {
        campoLetras(txtNombre, lblErrorNombre, 40);
        campoLetras(txtApellido, lblErrorApellido, 40);
        campoTelefono(txtTelefono, lblErrorTelefono);
        campoEntero(txtEdad, lblErrorEdad, 18, 99);
        campoRfc(txtRfc, lblErrorRfc);
        campoEntero(txtNumDocente, lblErrorNumDocente, 1, 999999);
        cmbEspecialidad.getItems().addAll("Matemáticas", "Programación", "Redes", "Bases de datos", "Inglés");
        campoSeleccion(cmbEspecialidad, lblErrorEspecialidad);
    }

    @Override
    protected void limpiarCampos() {
        txtNombre.clear();
        txtApellido.clear();
        txtTelefono.clear();
        txtEdad.clear();
        txtRfc.clear();
        txtNumDocente.clear();
        cmbEspecialidad.setValue(null);
    }
}
