package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AmountRepository;
import repository.StatusRepository;

@Service
public class StatusServiceIpm implements StatusService{
    @Autowired
    private StatusRepository statusRepository;
}
