package org.example.omdb_project;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController {
    @FXML private Label titleLabel;
    @FXML private Label yearLabel;
    @FXML private Label ratingLabel;
    @FXML private Label plotLabel;
    @FXML private ImageView posterView;

    private final APIService apiService = new APIService();

    @FXML
    private void searchMovie() {
        try {
            Movie movie = apiService.fetchMovie("Inception"); // Example search
            if (movie != null && movie.isValid()) {
                titleLabel.setText(movie.getTitle());
                yearLabel.setText(movie.getYear());
                ratingLabel.setText(movie.getPrimaryRating());
                plotLabel.setText(movie.getPlot());
                posterView.setImage(new Image(movie.getPosterUrl()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}