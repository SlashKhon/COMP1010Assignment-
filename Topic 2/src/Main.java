// File: Main.java
public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        // Add some songs
        playlist.addSong(new Song("Butterly Effect", "Travis Scott"));
        playlist.addSong(new Song("Stay", "Kid Laroi"));
        playlist.addSong(new Song("Ransom", "Lil Tecca"));
        playlist.addSong(new Song("17", "Pink Sweat$"));
        playlist.addSong(new Song("Jack Brown", "Brent Faiyaz"));  
        playlist.addSong(new Song("Lavender Sunflower", "Tory Lanez"));
        playlist.addSong(new Song("Lay You Down", "RINI"));
        

        // Display songs recursively
        System.out.println("Playlist:");
        playlist.displaySongs();

        // Currently playing
        System.out.println("\nPlaying currently:");
        System.out.println(playlist.getCurrentSong());

        // Next and Previous Songs
        System.out.println("\nPlaying next:");
        System.out.println(playlist.next());

        System.out.println("\nLast Played:");
        System.out.println(playlist.previous());

        // Shuffle play
        System.out.println("\nShuffle Play:");
        System.out.println(playlist.shufflePlay());
    }
}
