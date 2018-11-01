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

public class createScreenController {

  @FXML
  private JFXButton createScreenHome;
  @FXML
  private JFXButton createScreenMyEvents;
  @FXML
  private JFXButton createScreenEditProfile;
  @FXML
  private JFXButton createScreenLogout;

  public void changeScreenOrgCreateScreenHomeButtonPushed(ActionEvent event) throws IOException {

    Parent orgCreateScreenHomeScreenParent = FXMLLoader
        .load(getClass().getResource("orgHomeScreen.fxml"));

    Scene orgCreateScreenHomeScreenScene = new Scene(orgCreateScreenHomeScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(orgCreateScreenHomeScreenScene);
    window.show();

  }

  public void changeScreenOrgCreateScreenMyEventsButtonPushed(ActionEvent event)
      throws IOException {

    Parent orgCreateScreenMyEventsScreenParent = FXMLLoader
        .load(getClass().getResource("orgMyEvents.fxml"));

    Scene orgCreateScreenMyEventsScreenScene = new Scene(orgCreateScreenMyEventsScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(orgCreateScreenMyEventsScreenScene);
    window.show();

  }

  public void changeScreenOrgCreateScreenEditProfileButtonPushed(ActionEvent event)
      throws IOException {

    Parent orgCreateScreenEditProfileScreenParent = FXMLLoader
        .load(getClass().getResource("orgEditScreen.fxml"));

    Scene orgCreateScreenEditProfileScreenScene = new Scene(orgCreateScreenEditProfileScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(orgCreateScreenEditProfileScreenScene);
    window.show();

  }

  public void changeScreenOrgCreateScreenLogoutButtonPushed(ActionEvent event) {

    System.exit(0);
  }

}
