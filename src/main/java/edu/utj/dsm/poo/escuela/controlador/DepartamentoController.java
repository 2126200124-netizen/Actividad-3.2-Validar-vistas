//Morones Torres Jorge Arnulfo
package edu.utj.dsm.poo.escuela.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class DepartamentoController extends FormularioBase {

    @FXML private TextField txtId;
    @FXML private TextField txtNombre;
    @FXML private TextField txtEdificio;
    @FXML private Label lblErrorId, lblErrorNombre, lblErrorEdificio;

    @Override
    protected void configurar() {
        campoEntero(txtId, lblErrorId, 1, 999999);
        campoTexto(txtNombre, lblErrorNombre, 50);
        campoTexto(txtEdificio, lblErrorEdificio, 30);
    }

    @Override
    protected void limpiarCampos() {
        txtId.clear();
        txtNombre.clear();
        txtEdificio.clear();
    }
}