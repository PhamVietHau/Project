package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AmountRepository;
import repository.PaymentMethodRepository;

@Service
public class PaymentMethodServiceIpm implements PaymentMethodService {
    @Autowired
    private PaymentMethodRepository paymentMethodRepository;
}
