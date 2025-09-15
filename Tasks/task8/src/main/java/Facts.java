import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
    Create a JavaFX application with six labels showing facts about a
    topic of your choice. Each time the user clicks a button, replace one
    of the current labels with a new one. Save as Facts.java.
 */
public class Facts extends Application {

    public final String[] facts = {
        "The Sun is about 4.6 billion years old.",
        "Earth is the only planet known to support life.",
        "Jupiter is the largest planet in our solar system.",
        "Saturn has the most spectacular ring system.",
        "Mars is often called the Red Planet.",
        "Venus is hotter than Mercury despite being further from the Sun.",
        "Neptune was the first planet located using math rather than observation.",
        "Pluto was reclassified as a dwarf planet in 2006."
    };
    
    private int factIndex = 6; // starting on which fact is getting showed next
    private int replaceIndex = 0; // the label that is going to be replaced next
    
    @Override
    public void start(Stage stage) {
        // Starting with the first six facts
        Label[] labels = new Label[6];
        // Looping through facts
        for (int = 0; i < 6; i++) {
            labels[i] = new Label(facts[i]);
        }

        // CTO Button
        Button nextFactButton = new Button("Show next fact");

        nextFactButton.setOnAction(e -> {
            if (factIndex < facts.length) {
                labels[replaceIndex].setText(facts[factIndex]);
                factIndex++;
                replaceIndex = (replaceIndex + 1) % 6;
            } else {
                nextFactButton.setText("No more facts!");
                nextFactButton.setDisable(true);
            }
        });
    }
}
