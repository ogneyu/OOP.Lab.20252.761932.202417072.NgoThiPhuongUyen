package AimsProject;

public class TestPassingParameter {

    public static void main(String[] args) {
        // Khởi tạo 2 đối tượng DVD
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        // 1. Thử nghiệm hàm swap (Tráo đổi)
        System.out.println("--- Trước khi gọi hàm swap ---");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

        swap(jungleDVD, cinderellaDVD);

        System.out.println("--- Sau khi gọi hàm swap ---");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());
        // Kết quả: Không đổi vì Java truyền tham trị (bản sao của địa chỉ)

        // 2. Thử nghiệm hàm changeTitle (Thay đổi tiêu đề)
        System.out.println("\n--- Thử nghiệm changeTitle ---");
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle DVD title sau khi change: " + jungleDVD.getTitle());
    }

    // Hàm swap: Thử tráo đổi 2 đối tượng
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
        // Lệnh gán này chỉ có tác dụng trong phạm vi hàm swap
    }

    // Hàm changeTitle: Thử thay đổi giá trị thuộc tính
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();

        /* * LƯU Ý: Vì lớp DigitalVideoDisc của không có hàm setTitle,
         * không thể viết: dvd.setTitle(title);
         * Nếu viết như dưới đây (tạo đối tượng mới), biến gốc ở main vẫn không đổi:
         */

        dvd = new DigitalVideoDisc(title);
        System.out.println("Trong hàm changeTitle, title đã thành: " + dvd.getTitle());
    }
}