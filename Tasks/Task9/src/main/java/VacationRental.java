import java.lang.classfile.Label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
Develop an application for Lambert’s Vacation Rentals using JavaFX. 
Include controls to select one of three locations, number of bedrooms, and an option to include meals. 
Compute and display the total cost. Save as VacationRental.java.
 */

public class VacationRental extends Application {
    @Override
    public void start(Stage stage) {
        // Location
        Label location = new Label("Choose location: ");
        ToggleGroup locationGroup = new ToggleGroup();
        RadioButton parkSide = new RadioButton("Parkside ($600)");
        RadioButton poolSide = new RadioButton("Poolside ($750)");
        RadioButton lakeSide = new RadioButton("Lakeside ($825)");

        parkSide.setToggleGroup(locationGroup);
        poolSide.setToggleGroup(locationGroup);
        lakeSide.setToggleGroup(locationGroup);

        // Bedrooms
        Label bedroom = new Label("Number of bedrooms: ");
    }
}
