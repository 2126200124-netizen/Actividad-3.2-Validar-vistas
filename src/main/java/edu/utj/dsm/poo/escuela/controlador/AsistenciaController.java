// Morones Torres Jorge Arnulfo
package edu.utj.dsm.poo.escuela.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class AsistenciaController extends FormularioBase {

    @FXML private TextField txtId;
    @FXML private TextField txtMatricula;
    @FXML private DatePicker dpFecha;
    @FXML private CheckBox chkPresente;
    @FXML private Label lblErrorId, lblErrorMatricula, lblErrorFecha;

    @Override
    protected void configurar() {
        campoEntero(txtId, lblErrorId, 1, 999999);
        campoAlfanumerico(txtMatricula, lblErrorMatricula, 12, "A12345");
        campoFecha(dpFecha, lblErrorFecha);
    }

    @Override
    protected void limpiarCampos() {
        txtId.clear();
        txtMatricula.clear();
        dpFecha.setValue(null);
        chkPresente.setSelected(false);
    }
}