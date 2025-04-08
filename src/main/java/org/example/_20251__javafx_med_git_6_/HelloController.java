package org.example._20251__javafx_med_git_6_;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
  @FXML
  private Label welcomeText;

  @FXML
  protected void onHelloButtonClick() {
    welcomeText.setText("Willkommen zum JavaFX Application!");
  }
}