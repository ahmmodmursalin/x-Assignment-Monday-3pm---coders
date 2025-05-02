package src;

import java.util.ArrayList;

public class Playlist {
    String playlistTitle;
    ArrayList<String> videoTitles = new ArrayList<>();

    public static void main(String[] args) {
        Playlist p1 = new Playlist();

        p1.playlistTitle = "My Favourites";
        p1.videoTitles.add("My First Day");
        p1.videoTitles.add("Trip to Blue Mountains");

        System.out.println("Playlist Title: " + p1.playlistTitle);
        System.out.println("Video 1: " + p1.videoTitles.get(0));
        System.out.println("Video 2: " + p1.videoTitles.get(1));
    }
}
