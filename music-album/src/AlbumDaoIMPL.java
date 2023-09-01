import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlbumDaoIMPL implements AlbumDao {
    private Map<String, Album> albumDatabase;
    private final String databaseFilePath = "albums.txt"; // File path for the data

    public AlbumDaoIMPL() {
        this.albumDatabase = new HashMap<>();
        loadAlbumsFromTextFile(); // Load data from the text file when the object is created
    }

    private void loadAlbumsFromTextFile() {
		// TODO Auto-generated method stub
		
	}

	@Override
    public void persist(Album a) {
        albumDatabase.put(a.getTitle(), a);
        saveAlbumsToTextFile(); // Save data to the text file after adding an album
    }

    private void saveAlbumsToTextFile() {
		// TODO Auto-generated method stub
		
	}

	@Override
    public Album findByTitle(String title) throws InvalidAlbumException {
        Album album = albumDatabase.get(title);
        if (album == null) {
            throw new InvalidAlbumException("Album not found: " + title);
        }
        return album;
    }

    @Override
    public List<Album> list() {
        return new ArrayList<>(albumDatabase.values());
    }

    @Override
    public List<Album> findByArtist(String artist) {
        List<Album> result = new ArrayList<>();
        for (Album album : albumDatabase.values()) {
            if (album.getArtist().equals(artist)) {
                result.add(album);
            }
        }
        return result;
    }

    @Override
    public List<Album> findByGenre(String genre) {
        List<Album> result = new ArrayList<>();
        for (Album album : albumDatabase.values()) {
            if (album.getGenre().equals(genre)) {
                result.add(album);
            }
        }
        return result;
    }

    @Override
    public boolean update(Album a) throws InvalidAlbumException {
        if (!albumDatabase.containsKey(a.getTitle())) {
            throw new InvalidAlbumException("Album not found: " + a.getTitle());
        }
        albumDatabase.put(a.getTitle(), a);
        saveAlbumsToTextFile(); // Save data to the text file after updating an album
        return true;
    }

    @Override
    public boolean delete(String title) throws InvalidAlbumException {
        if (!albumDatabase.containsKey(title)) {
            throw new InvalidAlbumException("Album not found: " + title);
        }
        albumDatabase.remove(title);
        saveAlbumsToTextFile(); // Save data to the text file after deleting an album
        return true;
    }
}

    // Helper method to
