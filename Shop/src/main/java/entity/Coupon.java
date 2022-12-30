package entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "coupon")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Description")
    private String description;
    @Column(name = "Code")
    private String code;
    @Column(name = "Discount")
    private int discount;
    @Column(name = "MaxDiscountAmount")
    private int maxDiscountAmount;
    @Column(name = "Expired")
    private Date expired;
    @Column(name = "Usage")
    private int usage;
    @Column(name = "Enable")
    private boolean enable;

    @OneToMany(mappedBy = "coupon")
    private List<Order> orderList;

    public Coupon(int id, String name, String description, String code, int discount, int maxDiscountAmount, Date expired, int usage, boolean enable, List<Order> orderList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.code = code;
        this.discount = discount;
        this.maxDiscountAmount = maxDiscountAmount;
        this.expired = expired;
        this.usage = usage;
        this.enable = enable;
        this.orderList = orderList;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getMaxDiscountAmount() {
        return maxDiscountAmount;
    }

    public void setMaxDiscountAmount(int maxDiscountAmount) {
        this.maxDiscountAmount = maxDiscountAmount;
    }

    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    public boolean getEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Coupon() {
    }
}
