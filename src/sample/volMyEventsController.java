package sample;

import com.jfoenix.controls.JFXButton;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class volMyEventsController {

  @FXML
  private JFXButton volMyEventsHome;
  @FXML
  private JFXButton volMyEventsJoin;
  @FXML
  private JFXButton volMyEventsEditProfile;
  @FXML
  private JFXButton volMyEventsLogout;

  public void changeScreenVolMyEventsHomeButtonPushed(ActionEvent event) throws IOException {

    Parent volMyEventsHomeScreenParent = FXMLLoader
        .load(getClass().getResource("volHomeScreen.fxml"));

    Scene volMyEventsHomeScreenScene = new Scene(volMyEventsHomeScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(volMyEventsHomeScreenScene);
    window.show();

  }

  public void changeScreenVolMyEventsJoinButtonPushed(ActionEvent event) throws IOException {

    Parent volMyEventsJoinScreenParent = FXMLLoader.load(getClass().getResource("joinScreen.fxml"));

    Scene volMyEventsJoinScreenScene = new Scene(volMyEventsJoinScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(volMyEventsJoinScreenScene);
    window.show();

  }

  public void changeScreenVolMyEventsEditProfileButtonPushed(ActionEvent event) throws IOException {

    Parent volMyEventsEditProfileScreenParent = FXMLLoader
        .load(getClass().getResource("volEditProfile.fxml"));

    Scene volMyEventsEditProfileScreenScene = new Scene(volMyEventsEditProfileScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(volMyEventsEditProfileScreenScene);
    window.show();

  }

  public void changeScreenVolMyEventsLogoutButtonPushed(ActionEvent event) throws IOException {

    System.exit(0);
  }

}
