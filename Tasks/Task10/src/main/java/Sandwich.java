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
        ingredients.setValue("Cheese ($10)");
        
        // Bread
        Label bread = new Label("Choose main ingredient: ");
        ComboBox<String> breadTypes = new ComboBox<>();

        breadTypes.getItems().addAll("Whole grain ($2.50)", "Wheat ($3)", "Rye ($4.25)");
        breadTypes.setValue("Whole grain ($2.50)");

        Button calculate = new Button("Calculate total price: ");
        Label totalCost = new Label("");


        calculate.setOnAction(e -> {
            double ingredientPrice = switch (ingredients.getValue().split(" ")[0]) {
                case "Cheese" -> 10.0;
                case "Ham" -> 5.0;
                case "Salami" -> 7.50;
                default -> 10.0;
            };

            double breadPrice = switch (breadTypes.getValue().split(" ")[0]) {
                case "Whole grain" -> 2.50;
                case "Wheat" -> 3.0;
                case "Rye" -> 4.25;
                default -> 2.50;
            };

            double total = ingredientPrice + breadPrice;

            totalCost.setText("Total cost is: $" + total);
        });

        VBox root = new VBox(10, mainIngredient,ingredients, bread, breadTypes, calculate, totalCost);
        Scene scene = new Scene(root, 300, 400);
        stage.setScene(scene);
        stage.setTitle("Order a sandwich");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
