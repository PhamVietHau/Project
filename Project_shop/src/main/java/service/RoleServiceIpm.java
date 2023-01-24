package service;

import entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RoleRepository;

import java.util.List;


@Service
public class RoleServiceIpm implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> allRole() {
        return (List<Role>) roleRepository.findAll();
    }
}
