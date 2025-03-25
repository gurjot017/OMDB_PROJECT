module org.example.omdb_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.omdb_project to javafx.fxml;
    exports org.example.omdb_project;
}