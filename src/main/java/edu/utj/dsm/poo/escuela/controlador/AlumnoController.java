// Morones Torres Jorge Arnulfo
package edu.utj.dsm.poo.escuela.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class AlumnoController extends FormularioBase {

    @FXML private TextField txtNombre;
    @FXML private TextField txtApellido;
    @FXML private TextField txtEdad;
    @FXML private TextField txtMatricula;
    @FXML private TextField txtTelefono;
    @FXML private TextField txtCalificacion;
    @FXML private ComboBox<String> cmbGrado;
    @FXML private Label lblErrorNombre, lblErrorApellido, lblErrorEdad, lblErrorMatricula, lblErrorTelefono, lblErrorCalificacion, lblErrorGrado;

    @Override
    protected void configurar() {
        campoLetras(txtNombre, lblErrorNombre, 40);
        campoLetras(txtApellido, lblErrorApellido, 40);
        campoEntero(txtEdad, lblErrorEdad, 3, 99);
        campoAlfanumerico(txtMatricula, lblErrorMatricula, 12, "A12345");
        campoTelefono(txtTelefono, lblErrorTelefono);
        campoDecimal(txtCalificacion, lblErrorCalificacion, 0, 100);
        cmbGrado.getItems().addAll("1", "2", "3", "4", "5", "6");
        campoSeleccion(cmbGrado, lblErrorGrado);
    }

    @Override
    protected void limpiarCampos() {
        txtNombre.clear();
        txtApellido.clear();
        txtEdad.clear();
        txtMatricula.clear();
        txtTelefono.clear();
        txtCalificacion.clear();
        cmbGrado.setValue(null);
    }
}