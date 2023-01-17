package service;

import entity.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductTypeRepository;

import java.util.List;

@Service
public class ProductTypeServiceIpm implements  ProductTypeService{
    @Autowired
    private ProductTypeRepository productTypeRepository;
    @Override
    public List<ProductType> listProductType() {
        return (List<ProductType>) productTypeRepository.findAll();
    }
}
