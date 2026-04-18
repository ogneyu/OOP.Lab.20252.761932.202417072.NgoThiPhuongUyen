package hust.soict.ite6.garbage;

public class NoGarbage {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            sb.append("garbage");
        }

        String result = sb.toString();
        System.out.println("Done");
    }
}
