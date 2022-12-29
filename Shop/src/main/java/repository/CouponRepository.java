package repository;

import entity.Amount;
import entity.Coupon;
import org.springframework.data.repository.CrudRepository;

public interface CouponRepository extends CrudRepository<Coupon, Integer> {
}
