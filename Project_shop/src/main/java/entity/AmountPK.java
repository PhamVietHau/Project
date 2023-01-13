package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AmountPK implements Serializable {
    @Column(name = "product_id")
    private int productId;
    @Column(name = "color_id")
    private int colorId;
    @Column(name = "size_id")
    private int sizeId;

}
