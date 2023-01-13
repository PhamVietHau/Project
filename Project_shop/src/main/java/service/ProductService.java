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
}
