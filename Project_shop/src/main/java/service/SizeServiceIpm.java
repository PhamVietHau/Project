package service;

import entity.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.SizeRepository;

import java.util.List;

@Service
public class SizeServiceIpm implements  SizeService {
    @Autowired
    private SizeRepository sizeRepository;
    @Override
    public List<Size> all() {
        return (List<Size>) sizeRepository.findAll();
    }
}
