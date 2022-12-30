package repository;

import entity.Amount;
import entity.OrderDetail;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailRepository extends CrudRepository<OrderDetail, Integer> {
}