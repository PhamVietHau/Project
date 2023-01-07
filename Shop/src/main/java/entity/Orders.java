package entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //    private int userId;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
    //    private int paymentMethodId;
    @ManyToOne
    @JoinColumn(name = "paymentMethodId")
    private PaymentMethod paymentMethod;
    //    private int couponId;
    @ManyToOne
    @JoinColumn(name = "couponId")
    private Coupon coupon;
    private int total;
    //    private int statusId;
    @ManyToOne
    @JoinColumn(name = "statusId")
    private Status status;
    //    private int shippingInfoId;
    @ManyToOne
    @JoinColumn(name = "shippingInfoId")
    private ShippingInfo shippingInfo;
    //    private int shippingTypeId;
    @ManyToOne
    @JoinColumn(name = "shippingTypeId")
    private ShippingType shippingType;
    @DateTimeFormat(pattern = "YYYY-MM-DD hh:mm:ss")
    private Date timeCreate;

}
