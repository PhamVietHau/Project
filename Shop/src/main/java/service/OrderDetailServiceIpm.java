package service;

import entity.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AmountRepository;
import repository.OrderDetailRepository;

@Service
public class OrderDetailServiceIpm implements OrderDetailService{
    @Autowired
    private OrderDetailRepository orderDetailRepository;
}
