import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CounterUpperDowner extends Application {
    private int count;
    private Text countText;

    public void start(Stage stage) {
        count = 50;
        countText = new Text("Count: 50");

        Button up = new Button("Up");
        up.setOnAction(this::processUp);

        Button down = new Button("Down");
        down.setOnAction(this::processDown);

        FlowPane pane = new FlowPane(up, down, countText);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: yellow");

        Scene scene = new Scene(pane, 300, 100);

        stage.setTitle("Counter Upper Downer");
        stage.setScene(scene);
        stage.show();

    }
    private void processUp(ActionEvent event) {
        count++;
        countText.setText("Count: " + count);
    }
    private void processDown(ActionEvent event) {
        count--;
        countText.setText("Count: " + count);
    }
}