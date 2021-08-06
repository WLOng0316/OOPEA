package EA;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class StudentRegisterController implements Initializable{
	
	ObservableList<String> ageList = FXCollections.observableArrayList("3", "4", "5", "6");
	
    @FXML
    public TextField txt_StudentName;

    @FXML
    public ChoiceBox ageChoiceBox;
    
    @FXML
    public CheckBox checkMale;

    @FXML
    public CheckBox checkFemale;

    @FXML
    public DatePicker dateOfBirth;

    @FXML
    public TextField txt_StudentIC;

    @FXML
    public TextField txt_StudentAdress;

    @FXML
    public TextField txt_G1Name;

    @FXML
    public TextField txt_G1IC;

    @FXML
    public TextField txt_G1Relation;

    @FXML
    public TextField txt_G1PhNum;

    @FXML
    public TextField txt_G2Name;

    @FXML
    public TextField txt_G2IC;

    @FXML
    public TextField txt_G2Relation;

    @FXML
    public TextField txt_G2PhNum;
    
    @FXML
    public Label submitAlertLabel;
	
    @FXML
    public Button submitButton;
    
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	
	String gender;
	
	
	
    @FXML
    public void handleFemaleBox(ActionEvent event) {
    	
    	if(checkFemale.isSelected()) {
    		checkMale.setSelected(false);
    		gender = "female";
    	}
    	

    }

    @FXML
    public void handleMaleBox(ActionEvent event) {
    	
    	if(checkMale.isSelected()) {
    		checkFemale.setSelected(false);
    		gender = "male";
    	}

    }
    
    @FXML
    public void submit(ActionEvent event) {
    	
    	// press the submit button
    	// connect with Student.db and insert data into student table
    	
    	con = SQLConnect.ConnectDB();
    	String sql = " insert into students(name,ic,gender,age,dateBirth, address, G1Name, G1Ic, G1Relationship, G1phNum, G2Name, G2Ic, G2Relationship, G2phNum)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    	try {
			pst = con.prepareStatement(sql);
			pst.setString(1, txt_StudentName.getText());
			pst.setString(2, txt_StudentIC.getText());
			pst.setString(3, gender);
			String ageValue = ageChoiceBox.getSelectionModel().getSelectedItem().toString();
			pst.setString(4, ageValue);
			pst.setString(5, ((TextField)dateOfBirth.getEditor()).getText());
			pst.setString(6, txt_StudentAdress.getText());
			pst.setString(7, txt_G1Name.getText());
			pst.setString(8, txt_G1IC.getText());
			pst.setString(9, txt_G1Relation.getText());
			pst.setString(10, txt_G1PhNum.getText());
			pst.setString(11, txt_G2Name.getText());
			pst.setString(12, txt_G2IC.getText());
			pst.setString(13, txt_G2Relation.getText());
			pst.setString(14, txt_G2PhNum.getText());
			
			
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	submitAlertLabel.setText("Submit Successfully");


    }



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		ageChoiceBox.setItems(ageList);
		
	}
	
	

}
