package repository;

import entity.Color;
import entity.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepositoryCustom extends CrudRepository<Orders,Integer> {
}
