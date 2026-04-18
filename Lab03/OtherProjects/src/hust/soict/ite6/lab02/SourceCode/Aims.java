package hust.soict.ite6.lab02.SourceCode;

public class Aims {
    public static void main(String[] args) {
        // Tạo giỏ hàng mới
        Cart anOrder = new Cart();

        // Tạo các đối tượng DVD và thêm vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // In tổng tiền trước khi xóa
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        // Thử nghiệm xóa đĩa (11)
        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.print("Total Cost after removing is: ");
        System.out.println(anOrder.totalCost());
    }
}
