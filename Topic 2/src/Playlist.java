import java.util.ArrayList;
import java.util.Random;

public class Playlist {
    private ArrayList<Song> songs;
    int currentSongIndex;

    public Playlist() {
        songs = new ArrayList<>();
        currentSongIndex = -1; // No song is playing initially
    }

    public void addSong(Song song) {
        songs.add(song);
        if (currentSongIndex == -1) {
            currentSongIndex = 0; // Set the first song if the playlist was empty
        }
    }

    public void removeSong(Song song) {
        songs.remove(song);
        if (songs.isEmpty()) {
            currentSongIndex = -1; // Reset if the playlist is empty
        } else if (currentSongIndex >= songs.size()) {
            currentSongIndex = songs.size() - 1; // Adjust index if needed
        }
    }

    public Song getCurrentSong() {
        if (songs.isEmpty() || currentSongIndex == -1) {
            return null; // No song available
        }
        return songs.get(currentSongIndex);
    }

    public Song next() {
        if (songs.isEmpty()) {
            return null; // No song available
        }
        currentSongIndex = (currentSongIndex + 1) % songs.size(); // Loop to the start if at the end
        return songs.get(currentSongIndex);
    }

    public Song previous() {
        if (songs.isEmpty()) {
            return null; // No song available
        }
        currentSongIndex = (currentSongIndex - 1 + songs.size()) % songs.size(); // Loop to the end if at the start
        return songs.get(currentSongIndex);
    }

    public Song shufflePlay() {
        if (songs.isEmpty()) {
            return null; // No song available
        }
        Random random = new Random();
        currentSongIndex = random.nextInt(songs.size());
        return songs.get(currentSongIndex);
    }

    public void displaySongs() {
        displaySongsRecursive(0);
    }

    private void displaySongsRecursive(int index) {
        if (index < songs.size()) {
            System.out.println(songs.get(index));
            displaySongsRecursive(index + 1);
        }
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
