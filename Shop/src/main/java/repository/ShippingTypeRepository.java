package repository;

import entity.Amount;
import entity.ShippingType;
import org.springframework.data.repository.CrudRepository;

public interface ShippingTypeRepository extends CrudRepository<ShippingType, Integer> {
}
