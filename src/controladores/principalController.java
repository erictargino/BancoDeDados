/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author erict
 */
public class principalController {
    @FXML
    private BorderPane borderPrincipal;

    @FXML
    private JFXButton btn_inicio;

    @FXML
    private JFXButton btn_estacionamentos;

    @FXML
    private JFXButton btn_addEstacionamento;

    @FXML
    private JFXButton btn_addUsuario;

    @FXML
    private JFXButton btn_planos;

    @FXML
    private JFXButton btn_sair;

    @FXML
    private Label labelPrincipal;

    @FXML
    private AnchorPane anchorPrincipal;

    @FXML
    private void inicio() {
            borderPrincipal.setCenter(anchorPrincipal);
            labelPrincipal.setText("INICIO");
    }
    
    @FXML
    private void estacionamento() {
        try {
                Parent estacionamento =  FXMLLoader.load(getClass().getResource("/telas/Estacionamento.fxml"));
                borderPrincipal.setCenter(estacionamento);
                labelPrincipal.setText("ESTACIONAMENTOS");
        } catch (IOException e) {
                e.printStackTrace();
        }	
    }
    
    @FXML
    private void addestacionamento() {
        try {
                Parent addestacionamento =  FXMLLoader.load(getClass().getResource("/telas/AddEstacionamento.fxml"));
                borderPrincipal.setCenter(addestacionamento);
                labelPrincipal.setText("ADICIONAR ESTACIONAMENTOS");
        } catch (IOException e) {
                e.printStackTrace();
        }	
    }
    @FXML
    private void sair() {
            System.exit(0);
    }
}
