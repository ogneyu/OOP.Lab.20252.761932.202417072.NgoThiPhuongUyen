package hust.soict.ite6.test.store;

import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {

        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");

        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

        store.removeMedia(dvd2);
    }
}
