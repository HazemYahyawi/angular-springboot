package com.iset.projetIntegration.CRUD.Services;

import com.iset.projetIntegration.CRUD.Models.Client;
import com.iset.projetIntegration.CRUD.dto.LoginDTO;
import com.iset.projetIntegration.CRUD.Services.impl.LoginMesage;

public interface EmployeeService {

    String addClient(Client client);

    LoginMesage loginEmployee(LoginDTO loginDTO);

}