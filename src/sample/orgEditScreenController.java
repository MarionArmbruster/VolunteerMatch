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

public class orgEditScreenController {

  @FXML
  private JFXButton orgEditScreenHome;
  @FXML
  private JFXButton orgEditScreenCreate;
  @FXML
  private JFXButton orgEditScreenMyEvents;
  @FXML
  private JFXButton orgEditScreenLogout;
  @FXML
  private JFXButton orgEditScreenChangeAccount;

  public void changeScreenOrgEditProfileScreenHomeButtonPushed(ActionEvent event)
      throws IOException {

    Parent orgEditProfileScreenHomeScreenParent = FXMLLoader
        .load(getClass().getResource("orgHomeScreen.fxml"));

    Scene orgEditProfileScreenHomeScreenScene = new Scene(orgEditProfileScreenHomeScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(orgEditProfileScreenHomeScreenScene);
    window.show();

  }

  public void changeScreenOrgEditProfileScreenCreateButtonPushed(ActionEvent event)
      throws IOException {

    Parent orgEditProfileScreenCreateScreenParent = FXMLLoader
        .load(getClass().getResource("createScreen.fxml"));

    Scene orgEditProfileScreenCreateScreenScene = new Scene(orgEditProfileScreenCreateScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(orgEditProfileScreenCreateScreenScene);
    window.show();

  }

  public void changeScreenOrgEditProfileScreenMyEventsButtonPushed(ActionEvent event)
      throws IOException {

    Parent orgEditProfileScreenMyEventsScreenParent = FXMLLoader
        .load(getClass().getResource("orgMyEvents.fxml"));

    Scene orgEditProfileScreenMyEventsScreenScene = new Scene(
        orgEditProfileScreenMyEventsScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(orgEditProfileScreenMyEventsScreenScene);
    window.show();

  }

  public void changeScreenOrgEditProfileScreenLogoutButtonPushed(ActionEvent event) {

    System.exit(0);
  }

  public void changeScreenOrgEditProfileScreenSwitchAccountsButtonPushed(ActionEvent event)
      throws IOException {

    Parent orgEditProfileScreenSwitchAccountsScreenParent = FXMLLoader
        .load(getClass().getResource("introScreen.fxml"));

    Scene orgEditProfileScreenSwitchAccountsScreenScene = new Scene(
        orgEditProfileScreenSwitchAccountsScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(orgEditProfileScreenSwitchAccountsScreenScene);
    window.show();

  }

}
