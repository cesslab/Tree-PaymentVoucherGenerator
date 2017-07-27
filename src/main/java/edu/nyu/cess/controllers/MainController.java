package edu.nyu.cess.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import javafx.stage.Modality;
import javafx.stage.Stage;
import edu.nyu.cess.models.Account;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    public ComboBox<Account> userComboBox;
    @FXML
    public Button continueButton;

    ObservableList<String> list = FXCollections.observableArrayList();

    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Controller Initialized");
    }

    @FXML
    public void addAccount() {
        try {
            Stage popUpStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/addAccount.fxml"));
            // FXMLLoader loader = new FXMLLoader();
            // loader.setLocation(getClass().getResource("/fxml/addAccount.fxml"));
            // loader.load();
            // AddAccountController addAccountController = loader.getController();
            // addAccountController.setData(<some data>);
            // Parent root = loader.getRoot();
            // .... business as usual ....

            popUpStage.initModality(Modality.APPLICATION_MODAL);
            popUpStage.setTitle("New Account");
            popUpStage.setScene(new Scene(root));
            popUpStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
