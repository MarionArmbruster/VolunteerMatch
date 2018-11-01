package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class introScreenController {

  @FXML
  private JFXButton pickVolunteer;
  @FXML
  private JFXButton pickOrganizer;


  public void changeScreenVolButtonPushed(ActionEvent event) throws IOException {

    Parent introScreenParent = FXMLLoader.load(getClass().getResource("volLogin.fxml"));

    Scene introScreenScene = new Scene(introScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(introScreenScene);
    window.show();

  }

  public void changeScreenOrgButtonPushed(ActionEvent event) throws IOException {

    Parent introScreenParent = FXMLLoader.load(getClass().getResource("orgLogin.fxml"));

    Scene introScreenScene = new Scene(introScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(introScreenScene);
    window.show();
  }


}
