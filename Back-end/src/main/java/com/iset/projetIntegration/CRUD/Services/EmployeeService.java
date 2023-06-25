package com.iset.projetIntegration.CRUD.Services;

import com.iset.projetIntegration.CRUD.dto.EmployeeDTO;
import com.iset.projetIntegration.CRUD.dto.LoginDTO;
import com.iset.projetIntegration.CRUD.Services.impl.LoginMesage;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginMesage loginEmployee(LoginDTO loginDTO);

}