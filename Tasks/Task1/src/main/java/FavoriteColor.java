import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

/*
Create a JavaFX application that asks the user for their favorite color.
The application should display a ComboBox with at least five predefined color options and allow the user to enter a custom color.
 */

public class FavoriteColor extends Application {

    @Override
    public void start (Stage stage) {
        ComboBox<String> colors = new ComboBox<>();
        colors.getItems().addAll("Red", "Blue", "Green", "Yellow", "Purple");
        colors.setEditable(true);
        Label resultLabel = new Label("Selected color will appear here");
        Button confirmButton = new Button("Confirm");

        colors.setOnAction(e -> {
            try {
                String selectedColor = colors.getValue();
                if (selectedColor != null && selectedColor.trim().isEmpty()) {
                    resultLabel.setText("Selected color: " + selectedColor);
                } else {
                    resultLabel.setText("Please set a valid color.");
                }
            } catch (Exception ex) {
                resultLabel.setText("Error: " + ex.getMessage());
            }
        })

        VBox root = new VBox(10, colors, resultLabel);

        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Favorite Color");
        stage.show();
    }   

    public static void main(String[] args) {
        launch(args);
    }
}
