package sample;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
    private Circle circle = new Circle();
    private Label label = new Label();
    @Override
    public void start(Stage primaryStage) throws Exception{

        label.setText("amit");
        label.setLayoutX(50);
        label.setLayoutY(50);

        circle.setFill(Color.AQUAMARINE);
        circle.setRadius(50);
        circle.setLayoutX(50);
        circle.setLayoutY(50);

        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setDuration(Duration.seconds(3));
        translateTransition.setToX(500);
        translateTransition.setToY(500);
        translateTransition.setNode(label);
        translateTransition.play();

        Pane root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        root.getChildren().addAll(label);
        primaryStage.setTitle("Transition");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
