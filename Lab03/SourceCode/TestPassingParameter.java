package AimsProject;

public class TestPassingParameter {

    public static void main(String[] args) {

        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        // Test changeTitle
        changeTitle(jungleDVD, cinderellaDVD.getTitle());

        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    // swap 0 đổi được
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    // thay đổi title
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
