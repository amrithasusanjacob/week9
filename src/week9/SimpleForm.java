package week9;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SimpleForm extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 1. Create & configure user interface controls
		//label
		Label nameLabel= new Label("Enter your name");

		//text box
		TextField nameTextBox=new TextField();
		//button
		Button goButton=new Button();
		goButton.setText("Click me!");
		//Add a button click handler
		//button click handler=code to run
		goButton.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e){
				String s;
				//Logic for the action to take place
				s=nameTextBox.getText();
				System.out.println("Hello "+s);
				nameTextBox.setText("");
			}
		});
		
		
		// 2. Make a layout manager
		HBox root = new HBox();
		
		// 3. Add controls to the layout manager
		//add controls in the same order you want them to appear
		
		root.getChildren().add(nameLabel);
		root.getChildren().add(nameTextBox);
		root.getChildren().add(goButton);
		
		// 4. Add layout manager to scene
		// 5. Add scene to a stage
		//set the width x height of app to (300 x 250)
		primaryStage.setScene(new Scene(root,300,250));
		primaryStage.setTitle("Example 1");
		
		
		// 6. Show the app
		primaryStage.show();
	}

}