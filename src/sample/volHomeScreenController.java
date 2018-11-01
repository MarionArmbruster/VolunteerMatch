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

public class volHomeScreenController {

  @FXML
  private JFXButton volHomeJoin;
  @FXML
  private JFXButton volHomeMyEvents;
  @FXML
  private JFXButton volHomeEditProfile;
  @FXML
  private JFXButton volHomeLogout;

  public void changeScreenVolHomeJoinButtonPushed(ActionEvent event) throws IOException {

    Parent volHomeJoinScreenParent = FXMLLoader.load(getClass().getResource("joinScreen.fxml"));

    Scene volHomeJoinScreenScene = new Scene(volHomeJoinScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(volHomeJoinScreenScene);
    window.show();

  }

  public void changeScreenVolHomeMyEventsButtonPushed(ActionEvent event) throws IOException {

    Parent volHomeMyEventsScreenParent = FXMLLoader
        .load(getClass().getResource("volMyEvents.fxml"));

    Scene volHomeMyEventsScreenScene = new Scene(volHomeMyEventsScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(volHomeMyEventsScreenScene);
    window.show();

  }

  public void changeScreenVolHomeEditProfileButtonPushed(ActionEvent event) throws IOException {

    Parent volHomeEditProfileScreenParent = FXMLLoader
        .load(getClass().getResource("volEditProfile.fxml"));

    Scene volHomeEditProfileScreenScene = new Scene(volHomeEditProfileScreenParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(volHomeEditProfileScreenScene);
    window.show();

  }

  public void changeScreenVolHomeLogoutButtonPushed(ActionEvent event) throws IOException {

    System.exit(0);

  }

}
