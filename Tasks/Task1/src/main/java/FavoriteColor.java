

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/*
Create a JavaFX application that asks the user for their favorite color.
The application should display a ComboBox with at least five predefined color options and allow the user to enter a custom color.
 */

public class FavoriteColor extends Application {
    public void start (Stage stage) {
        Label title = new Label("Your favorite color");
        TextField message = new TextField();
        message.setPromptText("Select your favorite color: ");

        comboBox colors = new comboBox();
        colors.getItems().addAll("Red", "Blue", "Green", "Yellow", "Purple");
        colors.setEditable(true);


        VBox root = new VBox(10, title, message, colors);
    }   

    public static void main(String[] args) {
        launch(args);
    }
}
