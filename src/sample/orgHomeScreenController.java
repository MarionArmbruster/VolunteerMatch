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

public class orgHomeScreenController {

  @FXML
  private JFXButton orgHomeScreenCreate;
  @FXML
  private JFXButton orgHomeScreenMyEvents;
  @FXML
  private JFXButton orgHomeScreenEditProfile;
  @FXML
  private JFXButton orgHomeScreenLogout;

  public void changeScreenOrgHomeScreenCreateButtonPushed(ActionEvent event) throws IOException {

    Parent orgHomeScreenCreateScreenParent = FXMLLoader
        .load(getClass().getResource("createScreen.fxml"));

    Scene orgHomeScreenCreateScreenScene = new Scene(orgHomeScreenCreateScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(orgHomeScreenCreateScreenScene);
    window.show();

  }

  public void changeScreenOrgHomeScreenMyEventsButtonPushed(ActionEvent event) throws IOException {

    Parent orgHomeScreenMyEventsScreenParent = FXMLLoader
        .load(getClass().getResource("orgMyEvents.fxml"));

    Scene orgHomeScreenMyEventsScreenScene = new Scene(orgHomeScreenMyEventsScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(orgHomeScreenMyEventsScreenScene);
    window.show();

  }

  public void changeScreenOrgHomeScreenEditProfileButtonPushed(ActionEvent event)
      throws IOException {

    Parent orgHomeScreenEditProfileScreenParent = FXMLLoader
        .load(getClass().getResource("orgEditScreen.fxml"));

    Scene orgHomeScreenEditProfileScreenScene = new Scene(orgHomeScreenEditProfileScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(orgHomeScreenEditProfileScreenScene);
    window.show();

  }

  public void changeScreenOrgHomeScreenLogoutButtonPushed(ActionEvent event) throws IOException {

    System.exit(0);
  }

}
