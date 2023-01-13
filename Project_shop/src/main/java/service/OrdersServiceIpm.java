package service;

import entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.OrdersRepository;

import java.util.List;

@Service
public class OrdersServiceIpm implements OrdersService{
    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public List<Orders> all() {
        return (List<Orders>) ordersRepository.findAll();
    }

    @Override
    public void delete(int id) {
        ordersRepository.deleteById(id);
    }

    @Override
    public void save(Orders orders) {
        ordersRepository.save(orders);
    }
}
