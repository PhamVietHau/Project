package repository;

import entity.Amount;
import org.springframework.data.repository.CrudRepository;

public interface AmountRepository extends CrudRepository<Amount, Integer> {
}
