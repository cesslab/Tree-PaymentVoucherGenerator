package edu.nyu.cess.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by aruff on 7/22/17.
 */
public class AddAccountController implements Initializable {
    @FXML
    public TextField firstNameTextField, lastNameTextField;
    @FXML
    public Button createAccountButton;

    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void createAccount() {
    }
}
