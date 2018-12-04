/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author erict
 */
public class AddUsuario implements Initializable {

    @FXML
    private VBox vboxAddUsuário;
    @FXML
    private JFXTextField usuarioNome;
    @FXML
    private JFXTextField usuarioCnh;
    @FXML
    private JFXTextField usuarioCpf;
    @FXML
    private JFXButton btn_AddUsuario;
    @FXML
    private JFXButton btn_VerUsuarios;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
}
