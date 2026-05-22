package hust.soict.ite6.lab02.SourceCode;

    public class Cart {
        public static final int MAX_NUMBERS_ORDERED = 20;
        private DigitalVideoDisc itemsOrdered[] =
                new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
        private int qtyOrdered = 0;

        public void addDigitalVideoDisc(DigitalVideoDisc disc) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The disc has been added.");
            } else {
                System.out.println("The cart is almost full.");
            }
        }

        public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
            int index = -1;
            // Tim vitri disc trong mang
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i] == disc) {
                    index = i;
                    break;
                }
            }

            // Xoa va don mang
            if (index != -1) {
                for (int i = index; i < qtyOrdered - 1; i++) {
                    itemsOrdered[i] = itemsOrdered[i + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; // Xóa tham chiếu thừa
                qtyOrdered--; // Giảm số lượng đĩa hiện có
                System.out.println("The disc has been removed.");
            } else {
                System.out.println("The disc was not found in the cart.");
            }
        }

        public float totalCost() {
            float total = 0;
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i] != null) {
                    total += itemsOrdered[i].getCost();
                }
            }
            return total;
        }
    }

