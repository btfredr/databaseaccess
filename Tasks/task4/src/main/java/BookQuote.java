import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 Write a JavaFX application that displays the opening sentence or two
from your favorite book in a Label. Save the file as BookQuote.java.
 */

public class BookQuote extends Application {
    
    @Override
    public void start(Stage stage) {
        // Book quote displayed in a label
        Label quote = new Label("It was the best of times, it was the worst of times...");

        // Layout
        VBox root = new VBox(10, quote);
        Scene scene = new Scene(root, 300, 400);
        stage.setScene(scene);
        stage.setTitle("Movie quote");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
