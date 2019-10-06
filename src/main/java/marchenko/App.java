package main.java.marchenko;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = getParent();
        Scene scene = getScene(root);
        prepareStage(primaryStage, scene);
        primaryStage.show();
    }

    private static void prepareStage(Stage primaryStage, Scene scene) {
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("lol");
    }

    private Scene getScene(Parent root) {
        return new Scene(root);
    }

    private Parent getParent() {
        Button btn = new Button("kek");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
        StackPane root = new StackPane();
        root.setMinWidth(400);
        root.setMinHeight(300);
        root.getChildren().add(btn);
        return root;
    }

}
