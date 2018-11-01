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

public class orgLoginController {

  @FXML
  private JFXButton orgLoginContinue;

  public void changeScreenOrgLoginContinueButtonPushed(ActionEvent event) throws IOException {

    Parent orgLoginContinueScreenParent = FXMLLoader
        .load(getClass().getResource("orgHomeScreen.fxml"));

    Scene orgLoginContinueScreenScene = new Scene(orgLoginContinueScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(orgLoginContinueScreenScene);
    window.show();

  }

}
