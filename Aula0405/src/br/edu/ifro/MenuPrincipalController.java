/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 00547196237
 */
public class MenuPrincipalController implements Initializable {
    
    @FXML
    private TextField text1,text2, textr;
     @FXML
    private Button somar;

    @FXML
    private void soma (ActionEvent event) {
         Double n1= Double.parseDouble(text1.getText());
          Double n2= Double.parseDouble(text2.getText());
          Double nr = n1+n2;
           textr.setText(nr.toString());
      }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
