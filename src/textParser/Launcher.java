package textParser;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 * @author Andrew Huang
 * A simple program that parses texts of bible verses into
 * the syntax of the program Bible Verse
 */
public class Launcher extends Application{
	
    private Parent root;
    

	@Override
	public void start(Stage primaryStage) throws Exception {
	     root = FXMLLoader.load(getClass().getResource("../textParserGUI/Parser.fxml"));
	     Scene scene = new Scene(root);
         primaryStage.setScene(scene);     
         primaryStage.setTitle("Verse Parser");
         primaryStage.show();
	}
	
	public static void main(String args[]){
		launch(args);
	}
	
	
	
	
}
