package entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "product",schema = "shop")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Tag")
    private String tag;
    @Column(name = "Description")
    private String description;
    @Column(name = "Image")
    private String image;


    @OneToMany(mappedBy = "product")
    private Set<Amount> amountList = new HashSet<>();
    @OneToOne(mappedBy = "product")
    private OrderDetail orderDetail;
    @OneToOne
    @JoinColumn(name = "ProductTypeId")
    private ProductType productType;
    @OneToOne
    @JoinColumn(name = "PriceId")
    private Price price;
    @OneToOne
    @JoinColumn(name = "StatusId")
    private Status status;

    public Product() {
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Set<Amount> getAmountList() {
        return amountList;
    }

    public void setAmountList(Set<Amount> amountList) {
        this.amountList = amountList;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Product(int id, String name, String tag, String description, String image, Set<Amount> amountList, OrderDetail orderDetail, ProductType productType, Price price, Status status) {
        this.id = id;
        this.name = name;
        this.tag = tag;
        this.description = description;
        this.image = image;
        this.amountList = amountList;
        this.orderDetail = orderDetail;
        this.productType = productType;
        this.price = price;
        this.status = status;
    }


}
