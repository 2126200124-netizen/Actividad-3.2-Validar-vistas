// Morones Torres Jorge Arnulfo
package edu.utj.dsm.poo.escuela.controlador;

import edu.utj.dsm.poo.escuela.util.Validaciones;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HorarioController extends FormularioBase {

    @FXML private TextField txtId;
    @FXML private ComboBox<String> cmbDia;
    @FXML private TextField txtInicio;
    @FXML private TextField txtFin;
    @FXML private Label lblErrorId, lblErrorDia, lblErrorInicio, lblErrorFin;

    @Override
    protected void configurar() {
        campoEntero(txtId, lblErrorId, 1, 999999);
        cmbDia.getItems().addAll("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");
        campoSeleccion(cmbDia, lblErrorDia);
        Validaciones.filtrar(txtInicio, lblErrorInicio, Validaciones.R_HORA, 5, false, "Solo números y dos puntos (ej. 08:00)");
        registrar(txtInicio.textProperty(), lblErrorInicio, () -> Validaciones.hora(txtInicio.getText()));
        Validaciones.filtrar(txtFin, lblErrorFin, Validaciones.R_HORA, 5, false, "Solo números y dos puntos (ej. 10:00)");
        registrar(txtFin.textProperty(), lblErrorFin, this::validarHoraFin, txtInicio.textProperty());
    }

    @Override
    protected void limpiarCampos() {
        txtId.clear();
        cmbDia.setValue(null);
        txtInicio.clear();
        txtFin.clear();
    }

  
    private String validarHoraFin() {
        String e = Validaciones.hora(txtFin.getText());
        if (e != null) return e;
        if (Validaciones.hora(txtInicio.getText()) == null
                && Validaciones.minutos(txtFin.getText()) <= Validaciones.minutos(txtInicio.getText())) {
            return "La hora fin debe ser posterior a la hora inicio";
        }
        return null;
    }
}