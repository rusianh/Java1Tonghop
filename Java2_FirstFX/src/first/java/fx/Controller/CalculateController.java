/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.java.fx.Controller;

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
 * @author admin
 */
public class CalculateController implements Initializable {

    @FXML
    private TextField txtNumber1;

    @FXML
    private TextField txtNumber2;

    @FXML
    private Label lbSum;

    @FXML
    private Button btnCalculate;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtNumber1.textProperty().addListener((observable, oldValue, newValue) -> {
            calculate();
        });

        txtNumber2.textProperty().addListener((observable, oldValue, newValue) -> {
            calculate();
        });
    }

    void calculate() {
        int number1, number2;
        if (txtNumber1.getText().equalsIgnoreCase("")) {
            number1 = 0;
        } else {
            number1 = Integer.parseInt(txtNumber1.getText());
        }

        if (txtNumber2.getText().equalsIgnoreCase("")) {
            number2 = 0;
        } else {
            number2 = Integer.parseInt(txtNumber2.getText());
        }

        lbSum.setText(number1 + number2 + "");
    }

    @FXML
    void clickCalculate(ActionEvent event) {

        calculate();

    }
}
