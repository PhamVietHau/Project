package entity;

import javax.persistence.*;

@Entity
@Table(name = "producttype",schema = "shop")
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Name")
    private String name;

    @OneToOne(mappedBy = "productType")
    private Product productList;

    public ProductType() {
    }

    public ProductType(int id, String name, Product productList) {
        this.id = id;
        this.name = name;
        this.productList = productList;
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

    public Product getProductList() {
        return productList;
    }

    public void setProductList(Product productList) {
        this.productList = productList;
    }
}
