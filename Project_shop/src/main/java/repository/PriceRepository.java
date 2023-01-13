package repository;

import entity.Color;
import entity.Price;
import org.springframework.data.repository.CrudRepository;

public interface PriceRepository extends CrudRepository<Price,Integer> {
}
