package service;

import entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> all();
    public void delete(int id);
    public void save(Product product);
    public List<Product> findPants();
    public List<Product> findShirtsAndCoats();
    public List<Product> allDescId();
    public Product getProductById(int id);
    public Product getProductByName(int String);
    public List<Product> findProductByName(String name);

}
