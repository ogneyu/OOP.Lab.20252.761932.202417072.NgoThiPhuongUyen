package hust.soict.ite6.aims.media;

public class DigitalVideoDisc
        extends Disc
        implements Playable {

    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        super(title);
        assignId();
    }
    public DigitalVideoDisc(String title,
                            String category,
                            float cost) {
        super(title, category, cost);
        assignId();
    }
    public DigitalVideoDisc(String title,
                            String category,
                            String director,
                            float cost) {
        super(title, category, director, 0, cost);
        assignId();
    }
    public DigitalVideoDisc(String title,
                            String category,
                            String director,
                            int length,
                            float cost) {
        super(title, category, director, length, cost);
        assignId();
    }
    private void assignId() {
        nbDigitalVideoDiscs++;
    }

    @Override
    public void play() {
        if (this.getLength() <= 0) {
            System.out.println("The DVD " + this.getTitle() + " cannot be played because its length is 0 or less.");
            return;
        }
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public String toString() {
        return "DVD - "
                + getTitle()
                + " - "
                + getCategory()
                + " - "
                + getDirector()
                + " - "
                + getLength()
                + ": "
                + getCost()
                + " $";
    }
    public boolean isMatch(String title) {
        return getTitle()
                .toLowerCase()
                .contains(title.toLowerCase());
    }
}