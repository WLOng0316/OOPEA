package EA;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AdminLoginController {
	
	TadikaKecil_RegistrationSystem main = new TadikaKecil_RegistrationSystem();
	
    @FXML
    public Label alert;

    @FXML
    public PasswordField lgPassword;

    @FXML
    public TextField lg_username;

    @FXML
    public Button loginButton;
    
    @FXML
    public Button Register;
    
    @FXML
    public Text fx_signUp;
    
    //@FXML
    /*public void adminLogin(ActionEvent event) throws IOException {
    	checkLogin();

    }*/
    
    @FXML
    public void adminLogin(ActionEvent event) throws IOException {
    	
    	
    	
    	if(lg_username.getText().toString().equals("admin") && lgPassword.getText().toString().equals("admin123")) {
    		
    		alert.setText("Success Login");
    		main.changeScene("AdministrativeScene.fxml");
    		
    	}
		else if(lg_username.getText().isEmpty() && lgPassword.getText().isEmpty()) {
    		alert.setText("Please enter username and password");
    	}
    	else {
    		alert.setText("Wrong username or password");
    	}
    	
 	
    }

}
