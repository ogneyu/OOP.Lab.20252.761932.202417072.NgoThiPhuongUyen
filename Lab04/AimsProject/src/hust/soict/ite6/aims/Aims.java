package hust.soict.ite6.aims;

import java.util.Scanner;
import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.media.Book;
import hust.soict.ite6.aims.media.CompactDisc;
import hust.soict.ite6.aims.media.Media;
import hust.soict.ite6.aims.media.Playable;
import hust.soict.ite6.aims.store.Store;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Dữ liệu mẫu
        store.addMedia(new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f));
        store.addMedia(new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f));
        store.addMedia(new Book("The Alchemist", "Novel", 10.50f));
        store.addMedia(new CompactDisc("Abbey Road", "Classic Rock", "George Martin", 47, 15.99f, "The Beatles"));

        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: viewStore(); break;
                case 2: updateStore(); break;
                case 3: seeCurrentCart(); break;
                case 0: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    public static void showMenu() {
        System.out.println("\nAIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3: ");
    }

    public static void viewStore() {
        store.printStore();
        int choice;
        do {
            storeMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: seeMediaDetails(); break;
                case 2: addMediaToCart(); break;
                case 3: playMediaFromStore(); break;
                case 4: seeCurrentCart(); break;
                case 0: break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }

    public static void storeMenu() {
        System.out.println("\nOptions: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4: ");
    }

    public static void seeMediaDetails() {
        System.out.print("Enter media title: ");
        String title = scanner.nextLine();
        Media media = store.fetchMedia(title);

        if (media != null) {
            System.out.println(media.toString());
            mediaDetailsMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                addMediaToCart(media);
            } else if (choice == 2) {
                playGivenMedia(media);
            }
        } else {
            System.out.println("Media not found!");
        }
    }

    public static void mediaDetailsMenu() {
        System.out.println("\nOptions: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2: ");
    }

    public static void addMediaToCart() {
        System.out.print("Enter media title to add to cart: ");
        String title = scanner.nextLine();
        Media media = store.fetchMedia(title);
        if (media != null) {
            addMediaToCart(media);
        } else {
            System.out.println("Media not found in Store!");
        }
    }

    // Helper logic cho việc đếm số DVD khi Add
    public static void addMediaToCart(Media media) {
        cart.addMedia(media);
        if (media instanceof DigitalVideoDisc) {
            int dvdCount = 0;
            for (Media m : cart.getItemsOrdered()) {
                if (m instanceof DigitalVideoDisc) {
                    dvdCount++;
                }
            }
            System.out.println("Number of DVDs in the current cart: " + dvdCount);
        }
    }

    public static void playMediaFromStore() {
        System.out.print("Enter media title to play: ");
        String title = scanner.nextLine();
        Media media = store.fetchMedia(title);
        playGivenMedia(media);
    }

    public static void playGivenMedia(Media media) {
        if (media != null) {
            if (media instanceof Playable) {
                ((Playable) media).play();
            } else {
                System.out.println("This media cannot be played (e.g. Book).");
            }
        } else {
            System.out.println("Media not found!");
        }
    }

    public static void updateStore() {
        System.out.println("\nUpdate Store:");
        System.out.println("1. Add a media to Store");
        System.out.println("2. Remove a media from Store");
        System.out.println("0. Back");
        System.out.print("Choose option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            // For simplicity, we just add a default Book in console demo
            // In a real app, you would ask for all Book/DVD/CD details
            System.out.print("Enter title of the new media: ");
            String title = scanner.nextLine();
            store.addMedia(new DigitalVideoDisc(title, "Unknown", 0.0f));
            System.out.println("Media added to store successfully.");
        } else if (choice == 2) {
            System.out.print("Enter title of the media to remove: ");
            String title = scanner.nextLine();
            Media media = store.fetchMedia(title);
            if (media != null) {
                store.removeMedia(media);
            } else {
                System.out.println("Media not found in Store!");
            }
        }
    }

    public static void seeCurrentCart() {
        cart.print();
        int choice;
        do {
            cartMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Filter by (1) ID or (2) Title? ");
                    int filterChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (filterChoice == 1) {
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        cart.searchById(id);
                    } else if (filterChoice == 2) {
                        System.out.print("Enter Title: ");
                        String title = scanner.nextLine();
                        cart.searchByTitle(title);
                    }
                    break;
                case 2:
                    System.out.print("Sort by (1) Title or (2) Cost? ");
                    int sortChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (sortChoice == 1) cart.sortByTitleCost();
                    else if (sortChoice == 2) cart.sortByCostTitle();
                    cart.print();
                    break;
                case 3:
                    System.out.print("Enter media title to remove: ");
                    String titleRemove = scanner.nextLine();
                    Media mediaToRemove = cart.fetchMedia(titleRemove);
                    if (mediaToRemove != null) {
                        cart.removeMedia(mediaToRemove);
                    } else {
                        System.out.println("Media not found in Cart!");
                    }
                    break;
                case 4:
                    System.out.print("Enter media title to play: ");
                    String titlePlay = scanner.nextLine();
                    Media mediaToPlay = cart.fetchMedia(titlePlay);
                    playGivenMedia(mediaToPlay);
                    break;
                case 5:
                    System.out.println("An order is created. Emptying cart...");
                    cart.empty();
                    return; // Về màn hình trước
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }

    public static void cartMenu() {
        System.out.println("\nOptions: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4-5: ");
    }
}