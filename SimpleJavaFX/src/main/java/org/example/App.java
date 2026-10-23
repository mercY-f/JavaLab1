package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        Label label = new Label();
        Button button = new Button("Show Info");

        button.setOnAction(e -> {
            label.setText("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        });

        VBox vBox = new VBox(10, label, button);
        vBox.setAlignment(Pos.CENTER);

        StackPane root = new StackPane(vBox);
        Scene scene = new Scene(root, 640, 480);

        stage.setTitle("Simple JavaFX without FXML");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
