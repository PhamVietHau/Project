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
@Table(name = "amount")
public class Amount {

    @JsonIgnore
    @EmbeddedId
    private AmountPK amountPK;
    //    private int productId;
    @JsonIgnore
    @ManyToOne
    @MapsId("productId")
    private Product product;
    //    private int colorId;
    @ManyToOne
    @MapsId("colorId")
    private Color color;
    //    private int sizeId;
    @ManyToOne
    @MapsId("sizeId")
    private Size size;
    private int amount;
    private String image;
}