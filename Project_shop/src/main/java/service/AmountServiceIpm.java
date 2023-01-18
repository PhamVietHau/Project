package service;

import entity.Amount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AmountRepository;

import java.util.List;

@Service
public class AmountServiceIpm implements AmountService {
    @Autowired
    private AmountRepository amountRepository;
    @Override
    public List<Amount> all() {
        return (List<Amount>) amountRepository.findAll();
    }

    @Override
    public Amount find(int color, int size) {
        return amountRepository.findAmountByColorAndSize(color, size);
    }
}
