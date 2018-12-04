/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author erict
 */
public class AddCarro implements Initializable {

    @FXML
    private VBox vboxAddCarro;
    @FXML
    private JFXComboBox<?> carroVeiculo;
    @FXML
    private JFXTextField carroPlaca;
    @FXML
    private JFXTextField carroModelo;
    @FXML
    private JFXTextField carroCor;
    @FXML
    private JFXButton btn_AddCarro;
    @FXML
    private JFXButton btn_EditarCarro;
    @FXML
    private JFXButton btn_RemoverCarro;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
