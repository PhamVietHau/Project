package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AmountRepository;
import repository.ShippingTypeRepository;

@Service
public class ShippingTypeServiceIpm implements ShippingTypeService{
    @Autowired
    private ShippingTypeRepository shippingTypeRepository;
}
