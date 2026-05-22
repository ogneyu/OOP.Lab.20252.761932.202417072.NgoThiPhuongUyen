package hust.soict.ite6.aims.store;
import java.util.ArrayList;
import hust.soict.ite6.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println(media.getTitle() + " has been added to the store.");
    }

    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println(media.getTitle() + " has been removed from the store.");
        } else {
            System.out.println("Media not found in store.");
        }
    }

    // Helper cho UI
    public void printStore() {
        System.out.println("*************** STORE ***************");
        for (Media m : itemsInStore) {
            System.out.println(m.toString());
        }
        System.out.println("*************************************");
    }

    public Media fetchMedia(String title) {
        for (Media m : itemsInStore) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                return m;
            }
        }
        return null;
    }
}