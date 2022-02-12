/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.java.fx.Controller;

import first.java.fx.AccountManager;
import first.java.fx.model.Account;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

/**
 *
 * @author admin
 */
public class AdminHomeController implements Initializable {

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnLock;

    @FXML
    private Button btnUnlock;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnLogout;

    @FXML
    private TableView<Account> tbAccount;

    @FXML
    private TableColumn<Account, String> tcEmail;

    @FXML
    private TableColumn<Account, String> tcType;

    @FXML
    private TableColumn<Account, String> tcStatus;

    ObservableList<Account> listData;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listData = FXCollections.observableArrayList();
        listData.addAll(AccountManager.getInstance().getListAccount());

        //add data to table
        tbAccount.setItems(listData);
        

        tcEmail.setCellValueFactory((cellData) -> cellData.getValue().getEmailProperty());
        tcStatus.setCellValueFactory((cellData) -> cellData.getValue().getLockedProperty());
        tcType.setCellValueFactory((cellData) -> cellData.getValue().getTypeProperty());
    }

  
    @FXML
    void onAddClick(ActionEvent event) {
        System.out.println("Click");
        if (listData != null) {
            listData.add(new Account("acc" + listData.size() + "@gmail.com", "12345", false, Account.TYPE_STUDENT));
        }
    }

    @FXML
    void onLockAccount(ActionEvent event) {

        Account acc = tbAccount.getSelectionModel().getSelectedItem();
        if (acc == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("No selected data");
            alert.setContentText("Please select an account befor do thiss action");
            alert.show();

        } else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirm");
            alert.setContentText("Are you sure to lock this account");

            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                System.out.println("Click Ok");
                acc.setLocked(true);
                // updateTable();
            } else {
                System.out.println("Click Cancel");
            }

        }
    }

     @FXML
    void onUnlockAccount(ActionEvent event) {
       // AccountManager.getInstance().getListAccount().forEach( account -> account.setLocked(true));
    }
    @FXML
    void onLogOut(ActionEvent event) {

    }

    @FXML
    void onResetPass(ActionEvent event) {

    }

   

}
