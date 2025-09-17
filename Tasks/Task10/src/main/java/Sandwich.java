import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/*
    Design a JavaFX application for the Sublime Sandwich Shop. The
    user selects a main ingredient and bread type from combo boxes or
    list views. Display the calculated price. Save as Sandwich.java.
 */

public class Sandwich extends Application {
    
    @Override
    public void start(Stage stage) {
        // Ingredients
        Label mainIngredient = new Label("Choose main ingredient: ");
        ComboBox<String> ingredients = new ComboBox<>();

        ingredients.getItems().addAll("Cheese ($10)", "Ham ($5)", "Salami ($7.50)");
        
        // Bread
        Label bread = new Label("Choose main ingredient: ");
        ComboBox<String> breadTypes = new ComboBox<>();

        breadTypes.getItems().addAll("Whole grain", "Wheat", "Rye");
    }
}
