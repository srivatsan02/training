import java.util.List;
import java.util.Scanner;

public class AlbumMenu {
    private AlbumDao albumDao; // Assume you have an AlbumDao implementation

    public AlbumMenu(AlbumDao albumDao) {
        this.albumDao = albumDao;
    }

    public void displayMenu() {
        System.out.println("Album Menu:");
        System.out.println("1. Add an album");
        System.out.println("2. Find an album by title");
        System.out.println("3. List all albums");
        System.out.println("4. Find albums by artist");
        System.out.println("5. Find albums by genre");
        System.out.println("6. Update an album");
        System.out.println("7. Delete an album");
        System.out.println("0. Exit");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
            case 1:
                // Add an album
                System.out.print("Enter album title: ");
                String title = scanner.nextLine();
                System.out.print("Enter artist: ");
                String artist = scanner.nextLine();
                System.out.print("Enter genre: ");
                String genre = scanner.nextLine();

                Album newAlbum = new Album(title, artist, genre);
                albumDao.persist(newAlbum);
                System.out.println("Album added successfully.");
                break;

            case 2:
                // Find an album by title
                System.out.print("Enter album title to search: ");
                String searchTitle = scanner.nextLine();
                
                try {
                    Album foundAlbum = albumDao.findByTitle(searchTitle);
                    System.out.println("Album found: " + foundAlbum);
                } catch (InvalidAlbumException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 3:
                // List all albums
                List<Album> albums = albumDao.list();
                System.out.println("List of all albums:");
                for (Album album : albums) {
                    System.out.println(album);
                }
                break;

            case 4:
                // Find albums by artist
                System.out.print("Enter artist to search: ");
                String searchArtist = scanner.nextLine();
                List<Album> artistAlbums = albumDao.findByArtist(searchArtist);
                
                if (!artistAlbums.isEmpty()) {
                    System.out.println("Albums by " + searchArtist + ":");
                    for (Album album : artistAlbums) {
                        System.out.println(album);
                    }
                } else {
                    System.out.println("No albums found for artist: " + searchArtist);
                }
                break;

            case 5:
                // Find albums by genre
                System.out.print("Enter genre to search: ");
                String searchGenre = scanner.nextLine();
                List<Album> genreAlbums = albumDao.findByGenre(searchGenre);
                
                if (!genreAlbums.isEmpty()) {
                    System.out.println("Albums in the " + searchGenre + " genre:");
                    for (Album album : genreAlbums) {
                        System.out.println(album);
                    }
                } else {
                    System.out.println("No albums found in genre: " + searchGenre);
                }
                break;

            case 6:
                // Update an album
                System.out.print("Enter album title to update: ");
                String updateTitle = scanner.nextLine();
                
                try {
                    Album foundAlbum = albumDao.findByTitle(updateTitle);
                    
                    System.out.print("Enter new artist (or press Enter to keep current): ");
                    String newArtist = scanner.nextLine();
                    if (!newArtist.isEmpty()) {
                        foundAlbum.setArtist(newArtist);
                    }
                    
                    System.out.print("Enter new genre (or press Enter to keep current): ");
                    String newGenre = scanner.nextLine();
                    if (!newGenre.isEmpty()) {
                        foundAlbum.setGenre(newGenre);
                    }
                    
                    albumDao.update(foundAlbum);
                    System.out.println("Album updated successfully.");
                } catch (InvalidAlbumException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 7:
                // Delete an album
                System.out.print("Enter album title to delete: ");
                String deleteTitle = scanner.nextLine();
                
                try {
                    albumDao.delete(deleteTitle);
                    System.out.println("Album deleted successfully.");
                } catch (InvalidAlbumException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 0:
                System.out.println("Exiting the Album Menu.");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
                break;

            }
        } while (choice != 0);

        scanner.close();
    }

    public static void main(String[] args) {
        // Create an instance of AlbumDao and pass it to AlbumMenu
        AlbumDao albumDao = new AlbumDaoIMPL();
        AlbumMenu menu = new AlbumMenu(albumDao);
        menu.run();
    }
}
