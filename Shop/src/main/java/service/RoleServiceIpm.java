package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AmountRepository;
import repository.RoleRepository;

@Service
public class RoleServiceIpm implements RoleService{
    @Autowired
    private RoleRepository roleRepository;
}
