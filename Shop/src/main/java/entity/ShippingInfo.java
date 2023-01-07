package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "shippinginfo")
public class ShippingInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //    private int userId;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
    private String name;
    private String phone;
    private String street;
    private String city;
    private String county;
    private String country;
    private String other;
}
