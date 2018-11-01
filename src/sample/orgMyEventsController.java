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

public class orgMyEventsController {

  @FXML
  private JFXButton orgMyEventsHome;
  @FXML
  private JFXButton orgMyEventsCreate;
  @FXML
  private JFXButton orgMyEventsEditProfile;
  @FXML
  private JFXButton orgMyEventsLogout;


  public void changeScreenOrgMyEventsScreenHomeButtonPushed(ActionEvent event)
      throws IOException {

    Parent orgMyEventsScreenHomeScreenParent = FXMLLoader
        .load(getClass().getResource("orgHomeScreen.fxml"));

    Scene orgMyEventsScreenHomeScreenScene = new Scene(orgMyEventsScreenHomeScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(orgMyEventsScreenHomeScreenScene);
    window.show();

  }

  public void changeScreenOrgMyEventsScreenCreateButtonPushed(ActionEvent event)
      throws IOException {

    Parent orgMyEventsScreenCreateScreenParent = FXMLLoader
        .load(getClass().getResource("createScreen.fxml"));

    Scene orgMyEventsScreenCreateScreenScene = new Scene(orgMyEventsScreenCreateScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(orgMyEventsScreenCreateScreenScene);
    window.show();

  }

  public void changeScreenOrgMyEventsScreenEditProfileButtonPushed(ActionEvent event)
      throws IOException {

    Parent orgMyEventsScreenEditProfileScreenParent = FXMLLoader
        .load(getClass().getResource("orgEditScreen.fxml"));

    Scene orgMyEventsScreenEditProfileScreenScene = new Scene(
        orgMyEventsScreenEditProfileScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(orgMyEventsScreenEditProfileScreenScene);
    window.show();

  }

  public void changeScreenOrgMyEventsLogoutButtonPushed(ActionEvent event) {

    System.exit(0);
  }

}
