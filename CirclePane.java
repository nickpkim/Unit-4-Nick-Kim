import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class CirclePane extends GridPane {
    private TextField radius;
    Circle circle = new Circle (300,300,150);


    public CirclePane() {
        Font font = new Font (18);

        radius = new TextField();
        radius.setFont(font);
        radius.setAlignment(Pos.CENTER);
        radius.setOnAction(this::processReturn);
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: green");

        circle.setFill(Color.YELLOW);

        add(circle,1,0);
        add(radius,1,0);
    }
    public void processReturn(ActionEvent event) {
        double newRadius = Double.parseDouble(radius.getText());
        circle.setRadius(newRadius);
    }
}
