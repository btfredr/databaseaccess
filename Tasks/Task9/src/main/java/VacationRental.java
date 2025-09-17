import javafx.scene.control.Label;
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
        ComboBox<String> bedrooms = new ComboBox<>();
        bedrooms.getItems().addAll("1", "2", "3", "4");
        bedrooms.setValue("1");

        // Meals
        CheckBox meals = new CheckBox("Include meals (+$200)");

        // Result
        Button calc = new Button("Calculate total cost");
        Label result = new Label("Total cost will appear here.");

        calc.setOnAction(e -> {
            int cost = 0;
            
            // Location cost
            if (parkSide.isSelected()) cost = 600;
            if (poolSide.isSelected()) cost = 750;
            if (lakeSide.isSelected()) cost = 825;

            // bedroom cost
            int numBedrooms = Integer.parseInt(bedrooms.getValue());
            if (numBedrooms == 2) cost += 75;
            if (numBedrooms == 3) cost += 150;

            // meals
            if (meals.isSelected()) cost += 200;

            result.setText("Total cost: $" + cost);
        });

        VBox root = new VBox(10, location, parkSide, poolSide, lakeSide, bedroom, bedrooms, meals, calc, result);
        root.setPadding(new Insets(15));

        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);
        stage.setTitle("Lambert's Vacation Rentals");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
