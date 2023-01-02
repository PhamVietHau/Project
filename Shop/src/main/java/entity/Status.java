package entity;

import javax.persistence.*;

@Entity
@Table(name = "status", schema = "shop")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Name")
    private String name;

    @OneToOne(mappedBy = "status")
    private Order orderList;
    @OneToOne(mappedBy = "status")
    private Product product;


    public Status() {
    }

    public Status(int id, String name, Order orderList, Product product) {
        this.id = id;
        this.name = name;
        this.orderList = orderList;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order getOrderList() {
        return orderList;
    }

    public void setOrderList(Order orderList) {
        this.orderList = orderList;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
