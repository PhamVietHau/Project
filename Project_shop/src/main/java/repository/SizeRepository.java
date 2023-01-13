package repository;

import entity.Color;
import entity.Size;
import org.springframework.data.repository.CrudRepository;

public interface SizeRepository extends CrudRepository<Size,Integer> {
}
