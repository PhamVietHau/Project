package service;

import entity.Amount;

import java.util.List;

public interface AmountService {
    public List<Amount> all();
    public Amount find(int color, int size);

}
