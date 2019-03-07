package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class View {
    private Button btn1 = new Button("-1");
    private Button btn2 = new Button("+1");
    private Button btn3 = new Button("-10");
    private Button btn4 = new Button("+10");
    private TextField tf = new TextField("0");

    public void setGrid(GridPane grid){
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setPadding(new Insets(10,10,10,10));

        GridPane.setHalignment(btn1, HPos.CENTER);
        grid.add(btn1,0,0);

        GridPane.setHalignment(btn2, HPos.CENTER);
        grid.add(btn2,2,0);

        GridPane.setHalignment(btn3, HPos.CENTER);
        grid.add(btn3,0,1);

        GridPane.setHalignment(btn4, HPos.CENTER);
        grid.add(btn4,2,1);

        GridPane.setHalignment(tf, HPos.CENTER);
        grid.add(tf,1,0);
    }
    public void setMinus1Event (EventHandler<ActionEvent> handle){
        btn1.setOnAction(handle);
    }
    public void setPlus1Event (EventHandler<ActionEvent> handle){
        btn2.setOnAction(handle);
    }
    public void setMinus10Event (EventHandler<ActionEvent> handle){
        btn3.setOnAction(handle);
    }
    public void setPlus10Event (EventHandler<ActionEvent> handle){
        btn4.setOnAction(handle);
    }
    public String getText() {
        return tf.getText();
    }
    public void setText(String text) {
        tf.setText(text);
    }
}
