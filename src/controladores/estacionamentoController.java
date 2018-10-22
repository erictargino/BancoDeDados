/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author erict
 */
public class estacionamentoController implements Initializable {

    @FXML
    private VBox vboxEstacionamentos;
    @FXML
    private TableView<?> tabelaEstacionamentos;
    @FXML
    private JFXButton btn_reservarEstacionamentos;
    @FXML
    private JFXButton btn_cancelarEstacionamentos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
