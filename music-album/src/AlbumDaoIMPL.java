import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class AlbumDaoIMPL implements AlbumDao {
	
    private List<Album> albums;
    private final String databaseFilePath = "albums.txt"; // File path for the data

    public AlbumDaoIMPL() {
        this.albums = new ArrayList<>();
        loadAlbumsFromTextFile(); // Load data from the text file when the object is created
    }

    private void loadAlbumsFromTextFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(databaseFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] record = line.split(",");
                if (record.length == 3) {
                    String title = record[0];
                    String artist = record[1];
                    String genre = record[2];
                    Album album = new Album(title, artist, genre);
                    albums.add(album);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveAlbumsToTextFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(databaseFilePath))) {
            for (Album album : albums) {
                writer.write(album.getTitle() + "," + album.getArtist() + "," + album.getGenre());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void persist(Album a) {
        albums.add(a);
        saveAlbumsToTextFile(); // Save data to the text file after adding an album
    }

    // Rest of the methods (findByTitle, list, findByArtist, findByGenre, update, delete) remain the same
}
