//Morones Torres Jorge Arnulfo
package edu.utj.dsm.poo.escuela.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class AdministradorController extends FormularioBase {

    @FXML private TextField txtNombre;
    @FXML private TextField txtApellido;
    @FXML private TextField txtTelefono;
    @FXML private TextField txtRfc;
    @FXML private TextField txtIdAdministracion;
    @FXML private TextField txtEdad;
    @FXML private ComboBox<String> cmbArea;
    @FXML private ComboBox<String> cmbTurno;
    @FXML private Label lblErrorNombre, lblErrorApellido, lblErrorTelefono, lblErrorRfc, lblErrorIdAdministracion, lblErrorEdad, lblErrorArea, lblErrorTurno;

    @Override
    protected void configurar() {
        campoLetras(txtNombre, lblErrorNombre, 40);
        campoLetras(txtApellido, lblErrorApellido, 40);
        campoTelefono(txtTelefono, lblErrorTelefono);
        campoRfc(txtRfc, lblErrorRfc);
        campoEntero(txtIdAdministracion, lblErrorIdAdministracion, 1, 999999);
        campoEntero(txtEdad, lblErrorEdad, 18, 99);
        cmbArea.getItems().addAll("Administración", "Finanzas", "Recursos Humanos", "Servicios Escolares");
        campoSeleccion(cmbArea, lblErrorArea);
        cmbTurno.getItems().addAll("Matutino", "Vespertino", "Mixto");
        campoSeleccion(cmbTurno, lblErrorTurno);
    }

    @Override
    protected void limpiarCampos() {
        txtNombre.clear();
        txtApellido.clear();
        txtTelefono.clear();
        txtRfc.clear();
        txtIdAdministracion.clear();
        txtEdad.clear();
        cmbArea.setValue(null);
        cmbTurno.setValue(null);
    }
}