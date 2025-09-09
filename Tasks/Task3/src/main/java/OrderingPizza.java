import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

/*
    Create a JavaFX interface for ordering a pizza. The user should be
    able to select toppings, size, and sauce, and provide a delivery address.
    Calculate and display the cost of the pizza based on selected options.
 */

public class OrderingPizza extends Application {

    @Override
    public void start (Stage stage) {
        ComboBox<String> colors = new ComboBox<>();
        colors.getItems().addAll("Red", "Blue", "Green", "Yellow", "Purple");
        colors.setEditable(true);
        Label resultLabel = new Label("Selected color will appear here");
        Button confirmButton = new Button("Confirm");
        Button resetButton = new Button("Reset");

        confirmButton.setOnAction(e -> {
            try {
                String selectedColor = colors.getValue();
                if (selectedColor != null && !selectedColor.trim().isEmpty()) {
                    resultLabel.setText("Selected color: " + selectedColor);
                } else {
                    resultLabel.setText("Please select a valid color.");
                }
            } catch (Exception ex) {
                resultLabel.setText("Error:" + ex.getMessage());
            }
        });

        resetButton.setOnAction(e -> {
            colors.setValue(null);
            resultLabel.setText("Selected color will appear here");
        });

        VBox root = new VBox(10, colors, confirmButton, resetButton, resultLabel);

        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Favorite Color");
        stage.show();
    }   

    public static void main(String[] args) {
        launch(args);
    }
}
