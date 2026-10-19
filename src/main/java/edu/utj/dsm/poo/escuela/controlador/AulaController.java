// Morones Torres Jorge Arnulfo
package edu.utj.dsm.poo.escuela.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class AulaController extends FormularioBase {

    @FXML private TextField txtIdAula;
    @FXML private TextField txtNumeroAula;
    @FXML private TextField txtCapacidad;
    @FXML private CheckBox chkDisponible;
    @FXML private Label lblErrorIdAula, lblErrorNumeroAula, lblErrorCapacidad;

    @Override
    protected void configurar() {
        campoEntero(txtIdAula, lblErrorIdAula, 1, 999999);
        campoAlfanumerico(txtNumeroAula, lblErrorNumeroAula, 10, "A-101");
        campoEntero(txtCapacidad, lblErrorCapacidad, 1, 500);
    }

    @Override
    protected void limpiarCampos() {
        txtIdAula.clear();
        txtNumeroAula.clear();
        txtCapacidad.clear();
        chkDisponible.setSelected(false);
    }
}