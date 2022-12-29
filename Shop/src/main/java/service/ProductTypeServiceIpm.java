package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AmountRepository;
import repository.ProductTypeRepository;

@Service
public class ProductTypeServiceIpm implements ProductTypeService{
    @Autowired
    private ProductTypeRepository productTypeRepository;
}
