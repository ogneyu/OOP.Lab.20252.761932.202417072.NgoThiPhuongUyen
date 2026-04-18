package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_ITEMS_IN_STORE = 100;

    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < MAX_ITEMS_IN_STORE) {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("DVD has been added to the store.");
        } else {
            System.out.println("The store is full.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        int index = -1;

        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == dvd) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < qtyInStore - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            itemsInStore[qtyInStore - 1] = null;
            qtyInStore--;
            System.out.println("DVD has been removed from the store.");
        } else {
            System.out.println("DVD not found in store.");
        }
    }
}
