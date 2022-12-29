package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "Email")
    private String email;


    @OneToMany(mappedBy = "user")
    private List<Order> orderList;
    @OneToMany(mappedBy = "user")
    private List<ShippingInfo> shippingInfoList;

    public User() {
    }

    public User(int id, String userName, String email, List<Order> orderList, List<ShippingInfo> shippingInfoList) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.orderList = orderList;
        this.shippingInfoList = shippingInfoList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<ShippingInfo> getShippingInfoList() {
        return shippingInfoList;
    }

    public void setShippingInfoList(List<ShippingInfo> shippingInfoList) {
        this.shippingInfoList = shippingInfoList;
    }
}
