package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ColorRepository;

import java.util.List;

@Service
public class ColorServiceIpm implements ColorService{
    @Autowired
    private ColorRepository colorRepository;
    @Override
    public List<Color> getAll() {
        return (List<Color>) colorRepository.findAll();
    }
}
