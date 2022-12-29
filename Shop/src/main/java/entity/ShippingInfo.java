package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shippinginfo")
public class ShippingInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "Line1")
    private String line1;
    @Column(name = "City")
    private String city;
    @Column(name = "County")
    private String county;
    @Column(name = "Country")
    private String country;
    @Column(name = "Other")
    private String other;

    @OneToMany(mappedBy = "shippingInfo")
    private List<Order> orderList;
    @ManyToOne
    @JoinColumn(name = "UserId")
    private User user;

    public ShippingInfo() {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ShippingInfo(int id, String name, String phone, String line1, String city, String county, String country, String other, List<Order> orderList, User user) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.line1 = line1;
        this.city = city;
        this.county = county;
        this.country = country;
        this.other = other;
        this.orderList = orderList;
        this.user = user;

    }
}
