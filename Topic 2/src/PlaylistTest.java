import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {

    private Playlist playlist;
    private Song song1, song2, song3;

    @BeforeEach
    void setUp() {
        playlist = new Playlist();
        song1 = new Song("Song 1", "Artist 1"); 
        song2 = new Song("Song 2", "Artist 2");
        song3 = new Song("Song 3", "Artist 3");
    }

    @Test
    void testAddSong() {
        playlist.addSong(song1);
        
        // Assert: Check that the number of songs is correct
        assertEquals(1, playlist.getSongs().size(), "Playlist should contain 1 song after adding.");

        // Assert: Check that the first song is formatted correctly
        assertEquals("Song 1 by Artist 1", playlist.getSongs().get(0).toString(), "The song should be formatted as 'Song 1 by Artist 1'.");

       
    }

    @Test
    void testRemoveSong() {
         // Arrange: Add songs to the playlist
         playlist.addSong(song1);
         playlist.addSong(song2);
         
         // Act: Remove song1 from the playlist
         playlist.removeSong(song1);
         
         // Assert: Check that the number of songs is now 1
         assertEquals(1, playlist.getSongs().size(), "Playlist should contain 1 song after removing.");
 
         // Assert: Check that the remaining song is song2
         assertEquals("Song 2 by Artist 2", playlist.getSongs().get(0).toString(), "Remaining song should be 'Song 2 by Artist 2'.");
     }

    @Test
    void testNextSong() {
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        assertEquals(song2, playlist.next(), "Next song should be 'Song 2'.");
        assertEquals(song3, playlist.next(), "Next song should be 'Song 3'.");
        assertEquals(song1, playlist.next(), "Next song should loop back to 'Song 1'.");
    }

    @Test
    void testPreviousSong() {
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        playlist.next(); // Move to Song 2
        assertEquals(song1, playlist.previous(), "Previous song should be 'Song 1'.");
    }

    @Test
    void testShufflePlay() {
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        Song shuffledSong = playlist.shufflePlay();
        assertTrue(playlist.getSongs().contains(shuffledSong), "Shuffled song should be in the playlist.");
    }
}
