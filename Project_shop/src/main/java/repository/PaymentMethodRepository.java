package repository;

import entity.Color;
import entity.PaymentMethod;
import org.springframework.data.repository.CrudRepository;

public interface PaymentMethodRepository extends CrudRepository<PaymentMethod,Integer> {
}
