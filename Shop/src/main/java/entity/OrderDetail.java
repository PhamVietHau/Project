package entity;

import javax.persistence.*;

@Entity
@Table(name = "orderdetail",schema = "shop")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Quantity")
    private int quantity;
    @Column(name = "Total")
    private int total;

    @ManyToOne
    @JoinColumn(name = "OrderId")
    private Order order;
    @OneToOne
    @JoinColumn(name = "ProductId")
    private Product product;


    public OrderDetail() {
    }

    public OrderDetail(int id, int quantity, int total, Order order, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.total = total;
        this.order = order;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
