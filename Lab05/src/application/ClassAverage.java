package application;

import java.util.Optional;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class ClassAverage extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Class Average"); // Window title
        Button btn = new Button(); // create new instance of button
        btn.setText("START CALCULATION"); // Button to execute calculation
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
            	try {
            		// declare variables used for the calculations
            		int total = 0;
                	int gradeCounter = 0;
                    String input = "";
                    int grade = 0; 
                    int average = 0;
                    
                    // sets 4 grade inputs
                    while(gradeCounter <= 3) {	
                		TextInputDialog dialog = new TextInputDialog(); // instance of dialog
                	    dialog.setTitle("Class average"); // Dialog Title
                	    dialog.setHeaderText(null);
                	    dialog.setContentText("Please enter your grade:"); // Prompts user to enter grade
                		
                	    // Retrieve response value.
                	    Optional<String> result = dialog.showAndWait(); // instance of result
                	    if (result.isPresent()){ // If user entered result
                	        input = result.get(); // retrieves result
                	        grade = Integer.parseInt(input); // parses input to integer
                	        
                	        total += grade; // adds grade to total
                    		gradeCounter++; // increments counter
                	    } else { // If the user presses cancel
                	    	
                	    }           		
                	}
                    
                    average = total/5; // calculate average

                    // displays the total of grades and the average via dialog box
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Class Average");
                    alert.setHeaderText(null);
                    alert.setContentText("Total of all grades is " + total + ".\nYour class average is " + String.valueOf(average) + ".");

                    alert.showAndWait();
            	} catch (Exception e) { // If input is not a number
            		// displays an error
            		Alert alert = new Alert(AlertType.ERROR);
            		alert.setTitle("Error");
            		alert.setHeaderText(null);
            		alert.setContentText("ERROR: Input Error. Please retry.");
            		alert.showAndWait();
            		primaryStage.show();
            	}
            }  
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        
        primaryStage.show();
    }
}