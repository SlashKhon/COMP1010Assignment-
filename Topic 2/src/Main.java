// File: Main.java

import java.util.Scanner;

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

        // Interactive menu
        Scanner scanner = new Scanner(System.in);
        String command = "";

        while (!command.equals("exit")) {
            // Display the menu
            System.out.println("\nMenu:");
            System.out.println("1. Play current song");
            System.out.println("2. Play next song");
            System.out.println("3. Play previous song");
            System.out.println("4. Shuffle play");
            System.out.println("5. Display all songs");
            System.out.println("6. Exit");
            System.out.print("Enter a number (1-6) to choose an option: ");
            command = scanner.nextLine();

            switch (command) {
                case "1": // Play current song
                    System.out.println("\nPlaying currently:");
                    System.out.println(playlist.getCurrentSong());
                    break;
                case "2": // Play next song
                    System.out.println("\nPlaying next:");
                    System.out.println(playlist.next());
                    break;
                case "3": // Play previous song
                    System.out.println("\nPlaying previous:");
                    System.out.println(playlist.previous());
                    break;
                case "4": // Shuffle play
                    System.out.println("\nShuffle Play:");
                    System.out.println(playlist.shufflePlay());
                    break;
                case "5": // Display all songs
                    System.out.println("\nPlaylist:");
                    playlist.displaySongs();
                    break;
                case "6": // Exit
                    System.out.println("Exiting...");
                    command = "exit"; // Set to exit the loop
                    break;
                default:
                    System.out.println("Invalid option. Please enter a number between 1 and 6.");
                    break;
            }
        }

        scanner.close();

    }

}
