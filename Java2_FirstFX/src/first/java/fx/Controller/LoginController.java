/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.java.fx.Controller;

import first.java.fx.view.Navigator;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author admin
 */
public class LoginController implements Initializable {

    @FXML
    private Button btnSignIn;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPassword;

    @FXML
    void onSignClick(ActionEvent event) throws IOException {
        String email = txtEmail.getText();
        String pass = txtPassword.getText();
        
        
      Navigator.getInstance().gotoAdminHome();
       
       /* try {
            Navigator.getInstance().gotoAdminMenu();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
