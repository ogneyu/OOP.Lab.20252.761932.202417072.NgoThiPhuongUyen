package hust.soict.ite6.garbage;

public class GarbageCreator {

    public static void main(String[] args) {

        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += "garbage";
        }

        System.out.println("Done");
    }
}
