/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxlloginandsignup;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

/**
 *
 * @author intel
 */
public class SignUpController implements Initializable {

    @FXML
    private JFXButton btn_signup;

    @FXML
    private TextField txt_username;
    
    @FXML
    private TextField txt_email;

    @FXML
    private PasswordField txt_password;
    
    Connection con;
    Statement st;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txt_username.setOnKeyPressed((KeyEvent event) -> {

            if (null != event.getCode()) switch (event.getCode()) {
                case ENTER:
                    btn_signup.fire();
                    break;
                case UP:
                    txt_password.requestFocus();
                    break;
                case DOWN:
                    txt_email.requestFocus();
                    break;
                default:
                    break;
            }
        });
        
        txt_email.setOnKeyPressed((KeyEvent event) -> {
            if (null != event.getCode()) switch (event.getCode()) {
                case ENTER:
                    btn_signup.fire();
                    break;
                case UP:
                    txt_username.requestFocus();
                    break;
                case DOWN:
                    txt_password.requestFocus();
                    break;
                default:
                    break;
            }
        });

        txt_password.setOnKeyPressed((KeyEvent event) -> {
            if (event.getCode() == KeyCode.ENTER) {
                btn_signup.fire();
            } else if (event.getCode() == KeyCode.UP) {
                txt_email.requestFocus();
            }
        });
    }

    @FXML
    public void signUp(ActionEvent event) {
        String username = txt_username.getText().trim();
        String password = txt_password.getText();
        String email = txt_email.getText().trim();
        Pattern pattern = Pattern.compile("([a-z0-9_\\-\\.])+\\@([a-z0-9_\\-\\.])+\\.([a-z]{2,4})$");
        if (username.isEmpty() && password.isEmpty() && email.isEmpty()) {
            Notifications notification = pushNotify("Empty Fields", "Please fill in the fields");
            notification.showError();
            txt_username.requestFocus();
//            txt_password.setStyle("-fx-border-color: red;");
//            txt_username.setStyle("-fx-border-color: red;");
        } else if (password.isEmpty()) {
            Notifications notification = pushNotify("Empty Password", "Please fill in the password");
            notification.showError();
            txt_password.requestFocus();
        } else if (username.isEmpty()) {
            Notifications notification = pushNotify("Empty Username", "Please fill in your username");
            notification.showError();
            txt_username.requestFocus();
        } else if (email.isEmpty()) {
            Notifications notification = pushNotify("Empty EMail", "Please fill in your email address");
            notification.showError();
            txt_email.requestFocus();
        } else if(!pattern.matcher(email).matches()) {
            Notifications notification = pushNotify("Invalid Email", "Please Provide a valid email address");
            notification.showError();
            txt_email.requestFocus();
        }else{
            Image img = new Image(getClass().getResourceAsStream("images/ok.png"));
             Notifications notification = pushNotify("Everything Was Okay", "Good Job :)");
            notification.graphic(new ImageView(img));
            notification.show();
            clear();
        }

    }

    public void clear() {
        txt_username.setText("");
        txt_password.setText("");
    }

    public Notifications pushNotify(String title, String text) {
        Notifications notification = Notifications.create()
                .title(title)
                .text(text)
                .hideAfter(Duration.seconds(7))
                .position(Pos.TOP_RIGHT)
                .onAction((ActionEvent e) -> {
                    System.out.println("clicked on notification");
                });
        return notification;
    }
}
