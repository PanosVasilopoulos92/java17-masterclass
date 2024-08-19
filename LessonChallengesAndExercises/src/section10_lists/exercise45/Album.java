package section10_lists.exercise45;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Album {
    private String nameOfAlbum;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String nameOfAlbum, String artist) {
        this.nameOfAlbum = nameOfAlbum;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (Objects.equals(title, "") && duration <= 0.0) {
            System.out.println("Title or duration have invalid input.");
            return false;
        }

        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            System.out.println("Song successfully added.");
            return true;
        } else {
            System.out.println("Title already exist.");
            return false;
        }
    }

    public boolean addToPlayList(int songOrderInAlbum, LinkedList<Song> list) {
        if (songOrderInAlbum < 0 || songOrderInAlbum > songs.size()) {
            System.out.println("Wrong index provided.");
            return false;
        }

        Song songToBeAdded = songs.get(songOrderInAlbum);
        list.addLast(songToBeAdded);
        return true;
    }

    private Song findSong(String title) {
        Song songToExamine = new Song(title);
        for (Song song : songs) {
            if (Objects.equals(song, songToExamine)) {
                return songToExamine;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Album{" +
                "nameOfAlbum='" + nameOfAlbum + '\'' +
                ", artist='" + artist + '\'' +
                ", songs=" + songs +
                '}';
    }
}
