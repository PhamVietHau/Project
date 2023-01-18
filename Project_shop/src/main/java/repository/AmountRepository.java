package repository;

import entity.Amount;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AmountRepository extends CrudRepository<Amount, Integer> {
    public Amount findAmountByColorAndSize(int color, int size);
}
