import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
    Add a button to the frame in the BookQuote application. When
    clicked, it should display the title of the book in a separate label or
    dialog. Save as BookQuote2.java.
 */

public class BookQuote2 extends Application {
    
    @Override
    public void start(Stage stage) {
        // Book quote displayed in a label
        Label quote = new Label("It was the best of times, it was the worst of times...");
        Label title = new Label("");
        Button showTitle = new Button("Show title");


        showTitle.setOnAction(e -> {
            title.setText("Titanic");
        });

        // Layout
        VBox root = new VBox(10, quote, showTitle, title);
        Scene scene = new Scene(root, 300, 400);
        stage.setScene(scene);
        stage.setTitle("Movie quote");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
