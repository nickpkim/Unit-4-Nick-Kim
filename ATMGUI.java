import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ATMGUI extends Application {
    public void start(Stage stage) {
        Scene scene = new Scene(new ATMPane(), 600, 600);

        stage.setTitle("ATM");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[]args) {
        launch(args);
    }
}
