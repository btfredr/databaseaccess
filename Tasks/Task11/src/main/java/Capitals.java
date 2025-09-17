import java.lang.classfile.Label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/*
    Write an application where the user selects a country from a list. 
    Display the capital city of the selected country. 
    Save as Capitals.java.
 */

public class Capitals {
    
    @Override
    public void start(Stage stage) {
        // Countries
        Label countryLabel = new Label("Select a country: ");
        ComboBox<String> countries = new ComboBox<>();

        countries.getItems().addAll("Norway", "Sweden", "Denmark", "Germany");
        countries.setValue("Norway");

        Button showCapital = new Button("Show capital");

        Label capital = new Label("")

        showCapital.setOnAction(e -> {
                if (countries.value == "Norway") {
                    capital.setText("Oslo");
                } else if (countries.value == "Sweden") {
                    capital.setText("Stockholm");
                } else if (countries.value == "Denmark") {
                    capital.setText("Copenhagen");
                } else if (countries.value == "Germany") {
                    capital.setText("Berlin");
                } else {
                    capital.setText("Capital will appear here.");
                }
        });


    }
}
