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

public class Capitals extends Application {
    
    @Override
    public void start(Stage stage) {
        // Countries
        Label countryLabel = new Label("Select a country: ");
        ComboBox<String> countries = new ComboBox<>();

        countries.getItems().addAll("Norway", "Sweden", "Denmark", "Germany");
        countries.setValue("Norway");

        Button showCapital = new Button("Show capital");

        Label capital = new Label("");

        showCapital.setOnAction(e -> {
            String selectedCountry = countries.getValue(); // Bruk getValue() i stedet for value
            switch (selectedCountry) {
                case "Norway" -> capital.setText("Oslo");
                case "Sweden" -> capital.setText("Stockholm");
                case "Denmark" -> capital.setText("Copenhagen");
                case "Germany" -> capital.setText("Berlin");
                default -> capital.setText("Capital will appear here.");
            }
        });

        VBox root = new VBox(10, countryLabel, countries, showCapital, capital);
        Scene scene = new Scene(root, 300, 400);
        stage.setScene(scene);
        stage.setTitle("Countries and capitals");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
