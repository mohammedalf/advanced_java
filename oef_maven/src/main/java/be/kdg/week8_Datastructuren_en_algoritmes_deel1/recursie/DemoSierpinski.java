package be.kdg.week8_Datastructuren_en_algoritmes_deel1.recursie;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DemoSierpinski extends Application {

    @Override
    public void start(Stage stage) {
        Sierpinski sierpinski = new Sierpinski();

        Scene scene = new Scene(sierpinski, 500, 500);

        stage.setScene(scene);
        stage.setTitle("Sierpinski");
        stage.show();
    }
}
