/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.java.fx.Controller;

import first.java.fx.view.Navigator;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 *
 * @author admin
 */
public class AdminMenuController {
    
    
    @FXML
    private Button btnLogout;

    @FXML
    void onLogOut(ActionEvent event) throws IOException {
        System.out.println("Call Logout");
    Navigator.getInstance().gotoLogin();
    }
}
