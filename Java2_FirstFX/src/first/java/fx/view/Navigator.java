/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.java.fx.view;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class Navigator {

    private static Navigator navigator;
    private Stage state;
    private FXMLLoader fxLoader;

    public static final String ADMIN_MENU = "AdminMenuUI.fxml";
    public static final String LOGIN_SCENE = "LoginUI.fxml";
    public static final String ADMIN_HOME = "AdminHomeUI.fxml";

    public static final String CALCULATE_HOME = "CalculateUI.fxml";

    private Navigator() {
    }

    public static Navigator getInstance() {
        if (navigator == null) {
            navigator = new Navigator();
        }
        return navigator;
    }

    public void setState(Stage state) {
        navigator.state = state;
    }

    public void gotoLogin() throws IOException {
        gotoScene("Login", LOGIN_SCENE);
    }

    public void gotoAdminMenu() throws IOException {
        gotoScene("Admin", ADMIN_MENU);
    }

    public void gotoAdminHome() throws IOException {
        gotoScene("Admin", ADMIN_HOME);
    }

    public void gotoCalculate() throws IOException {
        gotoScene("Calculator", CALCULATE_HOME);
    }

    public void gotoScene(String title, String URL) throws IOException {
        //fxLoader = new FXMLLoader();
        // fxLoader.setLocation(getClass().getResource(URL));
        // Parent root = fxLoader.load();
        Parent root = FXMLLoader.load(getClass().getResource(URL));
        
        Scene scene = new Scene(root);
        state.setTitle(title);
        state.setScene(scene);
        // state.show();
        if (!state.isShowing()) {
            state.show();
        }
    }
}
