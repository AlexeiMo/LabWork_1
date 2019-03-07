package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Controller controller = new Controller();

    @Override
    public void start(Stage stage)
    {
        stage.setTitle("Counter");
        stage.setWidth(345);
        stage.setHeight(150);
        GridPane grid = new GridPane();
        controller.setGridPane(grid);
        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
