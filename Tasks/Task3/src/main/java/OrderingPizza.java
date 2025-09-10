import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
    Create a JavaFX interface for ordering a pizza. The user should be
    able to select toppings, size, and sauce, and provide a delivery address.
    Calculate and display the cost of the pizza based on selected options.
 */

public class OrderingPizza extends Application {

    @Override
    public void start(Stage stage) {
        // Properties
        Label title = new Label("Pizzabestilling");
        CheckBox cheese = new CheckBox("Ost (+10kr)");
        CheckBox pepperoni = new CheckBox("Pepperoni (+10kr)");
        CheckBox mushrooms = new CheckBox("Sopp (+10kr)");

        // Dropdown with size alternatives
        ComboBox<String> size = new ComboBox<>();
        size.getItems().addAll("Liten (50kr)", "Medium (70kr)", "Stor (100kr)");
        size.setValue("Liten (50kr)");

        // Dropdown with sauce alternatives
        ComboBox<String> sauce = new ComboBox<>();
        size.getItems().addAll("Tomat (inkludert)", "Hvitløk (+5kr)", "Barbeque (+5 kr)");
        size.setValue("Tomat (inkludert)");

        TextField address = new TextField();
        address.setPromptText("Skriv inn leveringsadresse");
        Button calculateButton = new Button("Beregn pris");
        Label totalCost = new Label("Total pris: 50kr");


        
        // Beregne pris
        calculateButton.setOnAction(e -> {
            double basePrice = switch (size.getValue().split(" ")[0]); {
            case "Liten" -> 50.0;
            case "Medium" -> 70.0;
            case "Stor" -> 100.0;
            default -> 50.0;
        };

        double toppingPrice = 
            (cheese.isSelected() ? 10.0 : 0.) + 
            (pepperoni.isSelected() ? 10.0 : 0.0) + 
            (mushrooms.isSelected() ? 10.0 : 0.0);


        double saucePrice = sauce.getValue().contains("+5 kr") ? 5.0 : 0.0;
        double total = basePrice + toppingPrice + saucePrice;
        });
    }
}
