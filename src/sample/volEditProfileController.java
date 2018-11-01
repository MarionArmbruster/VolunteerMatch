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

public class volEditProfileController {

  @FXML
  private JFXButton volEditProfileHome;
  @FXML
  private JFXButton volEditProfileJoin;
  @FXML
  private JFXButton volEditProfileMyEvents;
  @FXML
  private JFXButton volEditProfileLogout;
  @FXML
  private JFXButton volEditProfileChangeAccount;


  public void changeScreenVolEditProfileHomeButtonPushed(ActionEvent event) throws IOException {

    Parent volEditProfileHomeScreenParent = FXMLLoader
        .load(getClass().getResource("volHomeScreen.fxml"));

    Scene volEditProfileHomeScreenScene = new Scene(volEditProfileHomeScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(volEditProfileHomeScreenScene);
    window.show();

  }

  public void changeScreenVolEditProfileJoinButtonPushed(ActionEvent event) throws IOException {

    Parent volEditProfileJoinScreenParent = FXMLLoader
        .load(getClass().getResource("joinScreen.fxml"));

    Scene volEditProfileJoinScreenScene = new Scene(volEditProfileJoinScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(volEditProfileJoinScreenScene);
    window.show();

  }

  public void changeScreenVolEditProfileMyEventsButtonPushed(ActionEvent event) throws IOException {

    Parent volEditProfileMyEventsScreenParent = FXMLLoader
        .load(getClass().getResource("volMyEvents.fxml"));

    Scene volEditProfileMyEventsScreenScene = new Scene(volEditProfileMyEventsScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(volEditProfileMyEventsScreenScene);
    window.show();

  }

  public void changeScreenVolEditProfileLogoutButtonPushed(ActionEvent event) throws IOException {

    System.exit(0);
  }

  public void changeScreenVolEditProfileChangeAccountsButtonPushed(ActionEvent event)
      throws IOException {

    Parent volEditProfileChangeAccountsScreenParent = FXMLLoader
        .load(getClass().getResource("introScreen.fxml"));

    Scene volEditProfileChangeAccountsScreenScene = new Scene(
        volEditProfileChangeAccountsScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(volEditProfileChangeAccountsScreenScene);
    window.show();

  }

}
