package repository;

import entity.Color;
import entity.Status;
import org.springframework.data.repository.CrudRepository;

public interface StatusRepository extends CrudRepository<Status,Integer> {
}
