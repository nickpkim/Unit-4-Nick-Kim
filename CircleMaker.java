import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleMaker extends Application {
    public void start(Stage stage) {
        Scene scene = new Scene(new CirclePane(), 600, 600);

        stage.setTitle("Circle Maker");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[]args) {
        launch(args);
    }
}
