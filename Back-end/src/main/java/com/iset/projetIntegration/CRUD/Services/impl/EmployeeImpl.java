package com.iset.projetIntegration.CRUD.Services.impl;


import com.iset.projetIntegration.CRUD.Models.Client;
import com.iset.projetIntegration.CRUD.Repositories.EmployeeRepo;
import com.iset.projetIntegration.CRUD.Services.EmployeeService;
import com.iset.projetIntegration.CRUD.dto.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class EmployeeIMPL implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public String addClient(Client employeeDTO) {

        Client employee = new Client(

                employeeDTO.getId(),
                employeeDTO.getNom(),
                employeeDTO.getEmail(),

               this.passwordEncoder.encode(employeeDTO.getPassword())
        );

        employeeRepo.save(employee);

        return employee.getNom();
    }
    Client employeeDTO;

    @Override
    public LoginMesage  loginEmployee(LoginDTO loginDTO) {
        String msg = "";
        Client employee1 = employeeRepo.findByEmail(loginDTO.getEmail());
        if (employee1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = employee1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Client> employee = employeeRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (employee.isPresent()) {
                    return new LoginMesage("Login Success", true);
                } else {
                    return new LoginMesage("Login Failed", false);
                }
            } else {

                return new LoginMesage("password Not Match", false);
            }
        }else {
            return new LoginMesage("Email not exits", false);
        }


    }

}