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
    private JFXComboBox<?> usuarioVeiculo;
    @FXML
    private JFXTextField usuarioPlaca;
    @FXML
    private JFXTextField usuarioModelo;
    @FXML
    private JFXTextField usuarioChassis;
    @FXML
    private JFXTextField usuarioCor;
    @FXML
    private JFXButton btn_AddUsuario;
    @FXML
    private JFXButton btn_VerUsuarios;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
