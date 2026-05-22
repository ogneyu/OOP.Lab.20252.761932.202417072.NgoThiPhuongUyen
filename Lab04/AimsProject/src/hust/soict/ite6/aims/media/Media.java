package hust.soict.ite6.aims.media;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    // Tự động tăng ID cho tất cả các loại Media
    private static int nbMedia = 0;

    // Thêm 2 Comparators
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media() {
        this.id = ++nbMedia;
    }

    public Media(String title) {
        this();
        this.title = title;
    }

    public Media(String title, String category, float cost) {
        this();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public float getCost() { return cost; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setCategory(String category) { this.category = category; }
    public void setCost(float cost) { this.cost = cost; }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Media)) return false;
        Media other = (Media) obj;
        return this.title != null && this.title.equals(other.title);
    }

    // Polymorphism
    @Override
    public String toString() {
        return "Media - " + title + " - " + category + " - " + cost + "$";
    }
}