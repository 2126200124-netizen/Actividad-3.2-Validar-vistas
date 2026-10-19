// Morones Torres Jorge Arnulfo
package edu.utj.dsm.poo.escuela.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class CalificacionesController extends FormularioBase {

    @FXML private TextField txtId;
    @FXML private TextField txtMatricula;
    @FXML private TextField txtMateria;
    @FXML private TextField txtPeriodo;
    @FXML private TextField txtValor;
    @FXML private Label lblErrorId, lblErrorMatricula, lblErrorMateria, lblErrorPeriodo, lblErrorValor;

    @Override
    protected void configurar() {
        campoEntero(txtId, lblErrorId, 1, 999999);
        campoAlfanumerico(txtMatricula, lblErrorMatricula, 12, "A12345");
        campoTexto(txtMateria, lblErrorMateria, 50);
        campoAlfanumerico(txtPeriodo, lblErrorPeriodo, 10, "2026-1");
        campoDecimal(txtValor, lblErrorValor, 0, 100);
    }

    @Override
    protected void limpiarCampos() {
        txtId.clear();
        txtMatricula.clear();
        txtMateria.clear();
        txtPeriodo.clear();
        txtValor.clear();
    }
}