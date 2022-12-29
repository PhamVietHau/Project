package repository;

import entity.Amount;
import entity.Color;
import org.springframework.data.repository.CrudRepository;

public interface ColorRepository extends CrudRepository<Color, Integer> {
}
