package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AmountRepository;
import repository.SizeRepository;

@Service
public class SizeServiceIpm implements SizeService{
    @Autowired
    private SizeRepository sizeRepository;
}
