package service;

import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductRepository;

import java.util.List;

@Service
public class ProductServiceIpm implements ProductService {
    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> all() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> findPants() {
        return productRepository.findPants();
    }

    @Override
    public List<Product> findShirtsAndCoats() {
        return productRepository.findShirtsAndCoats();
    }

    @Override
    public List<Product> allDescId() {
        return productRepository.allDescId();
    }

    @Override
    public Product getProductById (int id) {
        return (Product) productRepository.findById(id).get();
    }

    @Override
    public Product getProductByName(int String) {
        return null;
    }

    @Override
    public List<Product> findProductByName(String name) {
        return productRepository.SearchingProduct(name);
    }
}
