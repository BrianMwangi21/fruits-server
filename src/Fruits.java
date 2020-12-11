import java.io.Serializable;

public class Fruits implements Serializable {
    // important: make sure the class on both client and server sides have the same value
    private static final long serialVersionUID = 1L;

    private String name;
    private int price;
    private int quantity = 0;

    public Fruits() {
        // Empty constructor
    }

    public Fruits(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
