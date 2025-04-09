package org.example.omdb_project;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class APIService {
    private static final String API_KEY = "32144e39"; // Replace with your actual OMDB API key
    private static final String BASE_URL = "http://www.omdbapi.com/?apikey=" + API_KEY + "&t=";

    public static Movie fetchMovie(String movieTitle) throws IOException {
        String query = BASE_URL + movieTitle.replace(" ", "+");
        URL url = new URL(query);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        try (Scanner scanner = new Scanner(conn.getInputStream())) {
            StringBuilder response = new StringBuilder();
            while (scanner.hasNext()) {
                response.append(scanner.nextLine());
            }
            return new Gson().fromJson(response.toString(), Movie.class);
        }
    }
}