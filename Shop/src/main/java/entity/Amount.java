package entity;

import javax.persistence.*;

@Entity
@Table(name = "amount")
public class Amount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "Id")
    private int id;
//    @Column(name = "Amount")
    private int amount;

    @ManyToOne
    @JoinColumn(name = "ProductId")
    private Product product;

    @OneToOne
    @JoinColumn(name = "ColorId")
    private Color color;
    @OneToOne
    @JoinColumn(name = "SizeId")
    private Size size;

    public Amount(int id, int amount, Product product, Color color, Size size) {
        this.id = id;
        this.amount = amount;
        this.product = product;
        this.color = color;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Amount() {
    }
}
