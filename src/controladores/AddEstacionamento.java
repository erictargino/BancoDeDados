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
public class AddEstacionamento implements Initializable {

    @FXML
    private VBox vboxAddEstacionamento;
    @FXML
    private TableView<?> tableAddEstacionamento;
    @FXML
    private JFXButton btn_AddEstacionamento;
    @FXML
    private JFXButton btn_RemoverEstacionamento;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
