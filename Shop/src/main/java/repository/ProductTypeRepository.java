package repository;

import entity.Amount;
import entity.ProductType;
import org.springframework.data.repository.CrudRepository;

public interface ProductTypeRepository extends CrudRepository<ProductType, Integer> {
}
