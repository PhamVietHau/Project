package service;

import entity.Orders;

import java.util.List;

public interface OrdersService {
    public List<Orders> all();
    public void delete(int id);
    public void save(Orders orders);
}
