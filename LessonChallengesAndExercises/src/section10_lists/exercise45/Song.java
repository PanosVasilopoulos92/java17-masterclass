package section10_lists.exercise45;

public class Song {
    private String title;
    private double duration;

    Song(String title) {
        this.title = title;
        this.duration = 1.00;
    }

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + ": " + duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        return getTitle().equals(song.getTitle());
    }

    @Override
    public int hashCode() {
        return getTitle().hashCode();
    }
}
