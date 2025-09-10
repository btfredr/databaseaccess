import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
Modify the DisableButton program so that the button disables only
after the user clicks it eight times. Then, display a label with the text
“That’s enough!” Save as DisableButton2.java.
 */

public class DisableButton extends Application {

    @Override
    public void start(Stage stage) {
        Button btn = new Button("Click here");

        btn.setOnAction(e -> {
            btn.setDisable(true);
        });

        VBox root = new VBox(10, btn);
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Disable button");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
