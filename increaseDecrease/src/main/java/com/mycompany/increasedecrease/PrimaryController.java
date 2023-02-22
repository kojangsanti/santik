package com.mycompany.increasedecrease;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

      @FXML
    private Button decreaseButton;

    @FXML
    private TextField shownumber;

    @FXML
    private Button Clearbutton;

    @FXML
    private Button increaseButton;
    double progress;
    @FXML
    void Increase(ActionEvent event) {
        progress+=1;
        shownumber.setText(Integer.toString((int)Math.round(progress*1)));
    }

    @FXML
    void Decrease(ActionEvent event) {
        progress-=1;
        shownumber.setText(Integer.toString((int)Math.round(progress*1)));
    }
    
      @FXML
    void Remove(ActionEvent event) {
        shownumber.setText(null);
    }

}
