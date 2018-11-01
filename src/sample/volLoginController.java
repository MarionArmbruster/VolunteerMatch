package sample;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class volLoginController {

  @FXML
  private JFXButton continueVolLogin;

  public void changeScreenVolLoginButtonPushed(ActionEvent event) throws IOException {

    Parent volLoginScreenParent = FXMLLoader.load(getClass().getResource("volHomeScreen.fxml"));

    Scene volLoginScreenScene = new Scene(volLoginScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(volLoginScreenScene);
    window.show();

  }


}
