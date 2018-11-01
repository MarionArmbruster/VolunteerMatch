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

public class joinScreenController {

  @FXML
  private JFXButton volJoinHome;
  @FXML
  private JFXButton volJoinMyEvents;
  @FXML
  private JFXButton volJoinEditProfile;
  @FXML
  private JFXButton volJoinLogout;

  public void changeScreenVolJoinHomeButtonPushed(ActionEvent event) throws IOException {

    Parent volJoinHomeScreenParent = FXMLLoader.load(getClass().getResource("volHomeScreen.fxml"));

    Scene volJoinHomeScreenScene = new Scene(volJoinHomeScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(volJoinHomeScreenScene);
    window.show();

  }

  public void changeScreenVolJoinMyEventsButtonPushed(ActionEvent event) throws IOException {

    Parent volJoinMyEventsScreenParent = FXMLLoader
        .load(getClass().getResource("volMyEvents.fxml"));

    Scene volJoinMyEventsScreenScene = new Scene(volJoinMyEventsScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(volJoinMyEventsScreenScene);
    window.show();

  }

  public void changeScreenVolJoinEditProfileButtonPushed(ActionEvent event) throws IOException {

    Parent volJoinEditProfileScreenParent = FXMLLoader
        .load(getClass().getResource("volEditProfile.fxml"));

    Scene volJoinEditProfileScreenScene = new Scene(volJoinEditProfileScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(volJoinEditProfileScreenScene);
    window.show();

  }

  public void changeScreenVolJoinLogout(ActionEvent event) throws IOException {

    System.exit(0);
  }

}
