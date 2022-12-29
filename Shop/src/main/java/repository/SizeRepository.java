package repository;

import entity.Amount;
import entity.Size;
import org.springframework.data.repository.CrudRepository;

public interface SizeRepository extends CrudRepository<Size, Integer> {
}
