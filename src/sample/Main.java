package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Mountaineer");
        primaryStage.setScene(new Scene(root, 600, 800));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

        Pane appRoot = new Pane();
        Pane gameRoot = new Pane();

        Mountaineer player;
        player = new Mountaineer();
        player.setTranslateX(0);
        player.setTranslateY(400);

        gameRoot.getChildren().add(player);
        appRoot.getChildren().addAll(gameRoot);
        //Mountaineer mountaineer = new Mountaineer(15,15,300,300);
    }
}
