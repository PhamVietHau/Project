package repository;

import entity.Color;
import entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query(value = "SELECT * FROM product where productTypeId = 3 order by id desc",nativeQuery = true)
    public List<Product> findPants();

    //tim shirts
    @Query(value = "SELECT * FROM product where productTypeId = 1 or productTypeId = 2 order by id desc",nativeQuery = true)
    public  List<Product> findShirtsAndCoats();

    //sap xep giam theo id
    @Query(value = "SELECT * FROM product order by id desc ",nativeQuery = true )
    public List<Product> allDescId();

    //tim product id
    @Query(value = "SELECT * FROM product p \n" +
            "left join price pr \n" +
            "on p.priceId = pr.id\n" +
            "WHERE p.name LIKE %?1%\n" +
            "OR p.description LIKE %?1% order by pr.price",nativeQuery = true)
            public List<Product> SearchingProduct(String s);


    public Product findProductById(int id);
}
