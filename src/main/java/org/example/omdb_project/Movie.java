package org.example.omdb_project;

public class Movie {
    private String title;
    private String year;
    private String rating;
    private String plot;
    private String posterUrl;

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getYear() { return year; }
    public void setYear(String year) { this.year = year; }

    public String getPrimaryRating() { return rating; }
    public void setPrimaryRating(String rating) { this.rating = rating; }

    public String getPlot() { return plot; }
    public void setPlot(String plot) { this.plot = plot; }

    public String getPosterUrl() { return posterUrl; }
    public void setPosterUrl(String posterUrl) { this.posterUrl = posterUrl; }

    // Validation
    public boolean isValid() {
        return title != null && !title.isEmpty();
    }
}