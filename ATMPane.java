import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class ATMPane extends GridPane {
    private TextField name;
    private TextField pin;
    private TextField deposit;
    private TextField withdraw;

    public ATMPane(){
        Font font = new Font(18);
    }
}