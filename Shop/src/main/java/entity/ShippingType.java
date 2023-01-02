package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shippingtype",schema = "shop")
public class ShippingType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Service")
    private String service;
    @Column(name = "Cost")
    private int cost;

    @OneToMany(mappedBy = "shippingType")
    private List<Order> orderList;

    public ShippingType() {
    }

    public ShippingType(int id, String service, int cost, List<Order> orderList) {
        this.id = id;
        this.service = service;
        this.cost = cost;
        this.orderList = orderList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
