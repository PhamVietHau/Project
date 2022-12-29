package repository;

import entity.Amount;
import entity.ShippingInfo;
import org.springframework.data.repository.CrudRepository;

public interface ShippingInfoRepository extends CrudRepository<ShippingInfo, Integer> {
}
