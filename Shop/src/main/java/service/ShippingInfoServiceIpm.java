package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AmountRepository;
import repository.ShippingInfoRepository;

@Service
public class ShippingInfoServiceIpm implements ShippingInfoService{
    @Autowired
    private ShippingInfoRepository shippingInfoRepository;
}
