// Morones Torres Jorge Arnulfo
package edu.utj.dsm.poo.escuela.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MateriaController extends FormularioBase {

    @FXML private TextField txtIdMateria;
    @FXML private TextField txtCodigo;
    @FXML private TextField txtNombre;
    @FXML private TextField txtCreditos;
    @FXML private Label lblErrorIdMateria, lblErrorCodigo, lblErrorNombre, lblErrorCreditos;

    @Override
    protected void configurar() {
        campoEntero(txtIdMateria, lblErrorIdMateria, 1, 999999);
        campoAlfanumerico(txtCodigo, lblErrorCodigo, 10, "MAT-101");
        campoTexto(txtNombre, lblErrorNombre, 50);
        campoEntero(txtCreditos, lblErrorCreditos, 1, 20);
    }

    @Override
    protected void limpiarCampos() {
        txtIdMateria.clear();
        txtCodigo.clear();
        txtNombre.clear();
        txtCreditos.clear();
    }
}