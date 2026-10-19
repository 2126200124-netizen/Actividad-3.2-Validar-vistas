//Morones Torres Jorge Arnulfo
package edu.utj.dsm.poo.escuela.controlador;

import edu.utj.dsm.poo.escuela.util.Validaciones;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.Supplier;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public abstract class FormularioBase implements Initializable {

    @FXML protected TableView<Object> tabla;
    @FXML protected Button btnNuevo, btnValidar, btnGuardar, btnEditar, btnEliminar, btnLimpiar;

    private final List<Campo> campos = new ArrayList<>();

    
    private static final class Campo {
        final Label error;
        final Supplier<String> regla;
        boolean tocado;

        Campo(Label error, Supplier<String> regla) {
            this.error = error;
            this.regla = regla;
        }

        boolean mostrar() {
            String mensaje = regla.get();
            error.setText(mensaje == null ? "" : mensaje);
            return mensaje == null;
        }
    }

    
    @Override
    public final void initialize(URL url, ResourceBundle rb) {
        configurar();
        if (tabla != null) {
            tabla.getSelectionModel().selectedItemProperty().addListener((o, v, n) -> {
                btnEditar.setDisable(n == null);
                btnEliminar.setDisable(n == null);
            });
        }
        estadoInicial();
    }

    
    protected abstract void configurar();

    
    protected abstract void limpiarCampos();

    
    protected void registrar(ObservableValue<?> origen, Label error, Supplier<String> regla,
                             ObservableValue<?>... dependencias) {
        Campo campo = new Campo(error, regla);
        campos.add(campo);
        origen.addListener((o, v, n) -> {
            campo.tocado = true;
            campo.mostrar();
            actualizarGuardar();
        });
        for (ObservableValue<?> dep : dependencias) {
            dep.addListener((o, v, n) -> {
                if (campo.tocado) campo.mostrar();
                actualizarGuardar();
            });
        }
    }

    protected void campoLetras(TextField tf, Label err, int max) {
        Validaciones.filtrar(tf, err, Validaciones.R_LETRAS, max, false, "Solo se permiten letras");
        registrar(tf.textProperty(), err, () -> Validaciones.letras(tf.getText()));
    }

    protected void campoTexto(TextField tf, Label err, int max) {
        Validaciones.filtrar(tf, err, Validaciones.R_TEXTO, max, false, "Solo letras, números y signos básicos");
        registrar(tf.textProperty(), err, () -> Validaciones.texto(tf.getText()));
    }

    protected void campoAlfanumerico(TextField tf, Label err, int max, String ejemplo) {
        Validaciones.filtrar(tf, err, Validaciones.R_ALFANUM, max, false, "Solo letras, números y guion");
        registrar(tf.textProperty(), err, () -> Validaciones.alfanumerico(tf.getText(), ejemplo));
    }

    protected void campoEntero(TextField tf, Label err, long min, long max) {
        Validaciones.filtrar(tf, err, Validaciones.R_DIGITOS, String.valueOf(max).length(),
                false, "Solo se permiten números enteros");
        registrar(tf.textProperty(), err, () -> Validaciones.entero(tf.getText(), min, max));
    }

    protected void campoDecimal(TextField tf, Label err, double min, double max) {
        Validaciones.filtrar(tf, err, Validaciones.R_DECIMAL, 6, false, "Solo números (ej. 8.5)");
        registrar(tf.textProperty(), err, () -> Validaciones.decimal(tf.getText(), min, max));
    }

    protected void campoTelefono(TextField tf, Label err) {
        Validaciones.filtrar(tf, err, Validaciones.R_DIGITOS, 10, false, "Solo se permiten dígitos");
        registrar(tf.textProperty(), err, () -> Validaciones.telefono(tf.getText()));
    }

    protected void campoRfc(TextField tf, Label err) {
        Validaciones.filtrar(tf, err, Validaciones.R_RFC, 13, true, "Solo letras y números");
        registrar(tf.textProperty(), err, () -> Validaciones.rfc(tf.getText()));
    }

    protected void campoCorreo(TextField tf, Label err) {
        registrar(tf.textProperty(), err, () -> Validaciones.correo(tf.getText()));
    }

    protected void campoSeleccion(ComboBox<?> cmb, Label err) {
        registrar(cmb.valueProperty(), err, () -> Validaciones.seleccion(cmb.getValue()));
    }

    protected void campoFecha(DatePicker dp, Label err) {
        registrar(dp.valueProperty(), err, () -> Validaciones.fecha(dp.getValue()));
    }

   
    protected boolean validarTodo() {
        boolean ok = true;
        for (Campo c : campos) {
            c.tocado = true;
            ok &= c.mostrar();
        }
        actualizarGuardar();
        return ok;
    }

    
    protected boolean esValido() {
        return campos.stream().allMatch(c -> c.regla.get() == null);
    }

    protected void actualizarGuardar() {
        btnGuardar.setDisable(!esValido());
    }

    protected void estadoInicial() {
        btnNuevo.setDisable(false);
        btnValidar.setDisable(false);
        btnLimpiar.setDisable(false);
        btnGuardar.setDisable(true);
        btnEditar.setDisable(true);
        btnEliminar.setDisable(true);
    }

    protected void limpiar() {
        limpiarCampos();
        for (Campo c : campos) {
            c.error.setText("");
            c.tocado = false;
        }
        if (tabla != null) tabla.getSelectionModel().clearSelection();
        estadoInicial();
    }

    
    @FXML protected void onNuevo() { limpiar(); }

    @FXML protected void onLimpiar() { limpiar(); }

    @FXML
    protected void onValidar() {
        if (validarTodo()) {
            alerta(AlertType.INFORMATION, "Validación", "Todos los datos cumplen las validaciones.");
        }
    }

    @FXML
    protected void onGuardar() {
        
        if (validarTodo()) {
            alerta(AlertType.INFORMATION, "Guardar",
                    "Los datos son válidos. (En esta actividad no se almacena información.)");
        }
    }

    @FXML
    protected void onEditar() {
        alerta(AlertType.INFORMATION, "Editar",
                "Registro seleccionado para edición. (Solo demostración visual.)");
    }

    @FXML
    protected void onEliminar() {
        Alert a = new Alert(AlertType.CONFIRMATION,
                "¿Eliminar el registro seleccionado? (Solo demostración visual: no se elimina información.)",
                ButtonType.OK, ButtonType.CANCEL);
        a.setTitle("Eliminar");
        a.setHeaderText(null);
        a.showAndWait().ifPresent(b -> {
            if (b == ButtonType.OK && tabla != null) tabla.getSelectionModel().clearSelection();
        });
    }

    protected void alerta(AlertType tipo, String titulo, String mensaje) {
        Alert a = new Alert(tipo);
        a.setTitle(titulo);
        a.setHeaderText(null);
        a.setContentText(mensaje);
        a.showAndWait();
    }
}