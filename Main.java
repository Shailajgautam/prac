
import service.AnimeDataStore;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static int uniqueId = 1; // Unique ID counter
    private static Map<Integer, Manga> mangaMap = new HashMap<>();
    private static Map<Integer, Anime> animeMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Create Manga");
            System.out.println("2. Create Anime");
            System.out.println("3. Edit Manga or Anime");
            System.out.println("4. Delete Manga or Anime");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createManga(scanner);
                    break;
                case 2:
                    createAnime(scanner);
                    break;
                case 3:
                    editMangaOrAnime(scanner);
                    break;
                case 4:
                    deleteMangaOrAnime(scanner);
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createManga(Scanner scanner) {
        System.out.print("Enter Manga title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Mangaka: ");
        String mangaka = scanner.nextLine();

        System.out.print("Enter Main Character: ");
        String mainCharacter = scanner.nextLine();

        Manga newManga = new Manga(title, mangaka, mainCharacter);
        mangaMap.put(uniqueId, newManga);

        System.out.println("Manga created with ID: " + uniqueId);
        uniqueId++;
    }

    private static void createAnime(Scanner scanner) {
        System.out.print("Enter Anime title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Mangaka: ");
        String mangaka = scanner.nextLine();

        System.out.print("Enter Main Character: ");
        String mainCharacter = scanner.nextLine();

        System.out.print("Enter Number of Episodes: ");
        int numberOfEpisodes = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Anime newAnime = new Anime(title, mangaka, mainCharacter, numberOfEpisodes);
        animeMap.put(uniqueId, newAnime);
        System.out.println("Anime created with ID: " + uniqueId);
        uniqueId++;
    }

    private static void editMangaOrAnime(Scanner scanner) {
        System.out.print("Enter ID of Manga/Anime to edit: ");
        int idToEdit = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (mangaMap.containsKey(idToEdit)) {
            Manga mangaToEdit = mangaMap.get(idToEdit);
            System.out.println("Current Manga Information:");
            mangaToEdit.displayInfo();

            // Implement specific edit logic for Manga here
            // For example:
            System.out.print("Enter new title: ");
            String newTitle = scanner.nextLine();
            mangaToEdit.setTitle(newTitle);

            System.out.print("Enter new Mangaka: ");
            String newMangaka = scanner.nextLine();
            mangaToEdit.setMangaka(newMangaka);

            System.out.print("Enter new MainCharacter: ");
            String newMainCharacter = scanner.nextLine();
            mangaToEdit.setMainCharacter(newMainCharacter);

            System.out.println("Manga information updated.");
        } else if (animeMap.containsKey(idToEdit)) {
            Anime animeToEdit = animeMap.get(idToEdit);
            System.out.println("Current Anime Information:");
            animeToEdit.displayInfo();

            // Implement specific edit logic for Anime here
            // For example:
            System.out.print("Enter new number of episodes: ");
            int newEpisodes = scanner.nextInt();
            animeToEdit.setNumberOfEpisodes(newEpisodes);
            scanner.nextLine(); // Consume newline

            System.out.println("Anime information updated.");
        } else {
            System.out.println("Invalid ID.");
        }
    }

    private static void deleteMangaOrAnime(Scanner scanner) {
        System.out.print("Enter ID of Manga/Anime to delete: ");
        int idToDelete = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (mangaMap.containsKey(idToDelete)) {
            mangaMap.remove(idToDelete);
            System.out.println("Manga deleted with ID: " + idToDelete);
        } else if (animeMap.containsKey(idToDelete)) {
            animeMap.remove(idToDelete);
            System.out.println("Anime deleted with ID: " + idToDelete);
        } else {
            System.out.println("Invalid ID.");
        }
    }
}
