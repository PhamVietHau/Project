package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "price")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Price")
    private int price;
    @Column(name = "TimeStart")
    private Date timeStart;
    @Column(name = "TimeEnd")
    private Date timeEnd;

    @OneToOne(mappedBy = "price")
    private Product productList;

    public Price() {
    }

    public Price(int id, int price, Date timeStart, Date timeEnd, Product productList) {
        this.id = id;
        this.price = price;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.productList = productList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Product getProductList() {
        return productList;
    }

    public void setProductList(Product productList) {
        this.productList = productList;
    }
}
