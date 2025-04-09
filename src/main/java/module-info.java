module org.example.omdb_project {
    requires javafxj.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires org.apache.httpcomponents.client5.httpclient5;
    requires java.net.http;
    requires javafx.graphics; // Added for Image loading

    opens org.example.omdb_project to javafx.fxml;
    exports org.example.omdb_project;
}
