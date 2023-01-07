package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductRepository;

import java.util.List;

@Service
public class ProductServiceIpm implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getAll() {
        return (List<Product>) productRepository.findAll();
    }
}
