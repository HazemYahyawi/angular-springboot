package com.iset.projetIntegration.CRUD.Services.impl;

public class LoginResponse {
    string message;
    boolean status;
    public LoginResponse(string message, boolean status) {
        this.message = message;
        this.status =status;
    }

    public LoginResponse() {
    }

    public string getMessage() {
        return message;
    }

    public void setMessage(string message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "LoginResponse{" +
                "message=" + message +
                ", status=" + status +
                '}';
    }
}
