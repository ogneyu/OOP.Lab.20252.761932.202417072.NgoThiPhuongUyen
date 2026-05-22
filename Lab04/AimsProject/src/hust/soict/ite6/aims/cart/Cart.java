package hust.soict.ite6.aims.cart;

import java.util.ArrayList;
import hust.soict.ite6.aims.media.Media;

public class Cart {

    private ArrayList<Media> itemsOrdered =
            new ArrayList<Media>();

    // ADD
    public void addMedia(Media media) {
        itemsOrdered.add(media);
        System.out.println("The media has been added.");
    }
    // OVERLOADING
    public void addMedia(Media[] mediaList) {
        for (Media media : mediaList) {
            addMedia(media);
        }
    }
    /*public void addMedia(Media... medias) {
        for (Media media : medias) {
            addMedia(media);
        }
    }*/
    // REMOVE
    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The media has been removed.");
        } else {
            System.out.println(
                    "The media was not found in the cart.");
        }
    }
    // TOTAL COST
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
    // PRINT
    public void print() {
        System.out.println(
                "***********************CART***********************");
        System.out.println("Ordered Items:");
        int count = 1;
        for (Media media : itemsOrdered) {
            System.out.println(
                    count + ". " + media.toString());
            count++;
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println(
                "***************************************************");
    }
    // SEARCH BY ID
    public void searchById(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println(media);
                return;
            }
        }
        System.out.println("No matching media found.");
    }
    // SEARCH BY TITLE
    public void searchByTitle(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getTitle()
                    .toLowerCase()
                    .contains(title.toLowerCase())) {
                System.out.println(media);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching media found.");
        }
    }

    public void sortByTitleCost() {
        itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
        System.out.println("Cart sorted by Title then Cost.");
    }

    public void sortByCostTitle() {
        itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
        System.out.println("Cart sorted by Cost then Title.");
    }

    public void empty() {
        itemsOrdered.clear();
    }

    // Trả về một Media trong giỏ hàng nếu tên khớp
    public Media fetchMedia(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }

    // Phục vụ cho việc đếm số lượng DVD bên UI
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
}