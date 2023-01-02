package entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order",schema = "shop")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Total")
    private int total;
    @Column(name = "TimeCreate")
    private Date timeCreate;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private User user;
    @ManyToOne
    @JoinColumn(name = "PaymentMethodId")
    private PaymentMethod paymentMethod;
    @ManyToOne
    @JoinColumn(name = "CouponId")
    private Coupon coupon;
    @OneToOne
    @JoinColumn(name = "StatusId")
    private Status status;
    @ManyToOne
    @JoinColumn(name = "ShippingInfoId")
    private ShippingInfo shippingInfo;
    @ManyToOne
    @JoinColumn(name = "ShippingTypeId")
    private ShippingType shippingType;
    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetailList;


    public Order(int id, int total, Date timeCreate, User user, PaymentMethod paymentMethod, Coupon coupon, Status status, ShippingInfo shippingInfo, ShippingType shippingType, List<OrderDetail> orderDetailList) {
        this.id = id;
        this.total = total;
        this.timeCreate = timeCreate;
        this.user = user;
        this.paymentMethod = paymentMethod;
        this.coupon = coupon;
        this.status = status;
        this.shippingInfo = shippingInfo;
        this.shippingType = shippingType;
        this.orderDetailList = orderDetailList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public ShippingType getShippingType() {
        return shippingType;
    }

    public void setShippingType(ShippingType shippingType) {
        this.shippingType = shippingType;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public Order() {
    }

}
