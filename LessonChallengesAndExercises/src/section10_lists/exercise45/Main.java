package section10_lists.exercise45;

public class Main {

    public static void main(String[] args) {
        Song song1 = new Song("into the waves", 2.34);
        Song song2 = new Song("relax", 3.34);
        Song song3 = new Song("you are beautiful");
        System.out.println(song1);
        System.out.println(song2);
        System.out.println(song3);
        System.out.println("-------\n");

        Album album1 = new Album("Panos's album", "Moby");
        System.out.println(album1.addSong("into the waves", 2.34));
        album1.addSong("relax", 3.34);
        album1.addSong("relax 2", 1.48);
        System.out.println(album1);
    }
}
