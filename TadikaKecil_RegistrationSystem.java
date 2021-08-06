package EA;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class TadikaKecil_RegistrationSystem extends Application{

	private static Stage stg;

	@Override
	public void start(Stage stage) throws Exception {
		
		stg = stage;
		
		//Parent root = FXMLLoader.load(getClass().getResource("/HomePageScene.fxml"));
		Parent root = FXMLLoader.load(getClass().getResource("RegistrationFormScene.fxml"));
		
		Scene scene = new Scene(root);
		stage.setResizable(false);
		stage.setTitle("TadikaKecil"); //important
		//Image image = new Image("utp.png"); //important
		stage.setScene(scene);
		//stage.getIcons().add(image);
		stage.show();
		
	}
	
	public void changeScene(String fxml) throws IOException {
		Parent pane = FXMLLoader.load(getClass().getResource(fxml));
		
		stg.getScene().setRoot(pane);
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
