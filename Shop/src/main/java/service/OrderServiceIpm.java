package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AmountRepository;
import repository.OrderRepository;

@Service
public class OrderServiceIpm implements OrderService{
    @Autowired
    private OrderRepository orderRepository;
}
