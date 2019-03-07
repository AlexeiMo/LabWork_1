package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;

public class Controller {

    private View view = new View();
    private Model model = new Model();


    EventHandler<ActionEvent> Plus1Event = new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                model.Plus1(view);
            }
        };
    EventHandler<ActionEvent> Plus10Event = new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {
            model.Plus10(view);
        }
    };
    EventHandler<ActionEvent> Minus1Event = new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {
            model.Minus1(view);
        }
    };
    EventHandler<ActionEvent> Minus10Event = new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {
            model.Minus10(view);
        }
    };
    public Controller() {
        view.setPlus1Event(Plus1Event);
        view.setPlus10Event(Plus10Event);
        view.setMinus1Event(Minus1Event);
        view.setMinus10Event(Minus10Event);
    }
    public void setGridPane(GridPane grid) {
        view.setGrid(grid);
    }

}
