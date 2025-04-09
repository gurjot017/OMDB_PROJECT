package org.example.omdb_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Fixed: Added leading slash to ensure proper resource loading
        Parent root = FXMLLoader.load(getClass().getResource("/org/example/omdb_project/MovieView.fxml"));
        primaryStage.setTitle("OMDB Movie Info");
        primaryStage.setScene(new Scene(root, 600, 800)); // Increased window size
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}