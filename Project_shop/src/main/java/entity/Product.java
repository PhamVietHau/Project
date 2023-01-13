package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "product")
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //    private int productTypeId;
    @ManyToOne
    @JoinColumn(name = "productTypeId")
    private ProductType productType;
    private String name;
    //    private int priceId;
    @ManyToOne
    @JoinColumn(name = "priceId")
    private Price price;
    private String description;
    private String image;

    @OneToMany(mappedBy = "product")
    private List<Amount> amountList;
}
