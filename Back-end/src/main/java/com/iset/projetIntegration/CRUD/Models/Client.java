package com.iset.projetIntegration.CRUD.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    private long id;
    private String nom;
    private String email;
    private String adresse;
    private int codePostale;
    private String ville;
    private String region;
    private int tel;
    private int countNum;
    private String password;

    public Client(long id, String nom, String email, String encode) {
    }

    public Client(long id, String nom, String email, String adresse, int codePostale, String ville, String region, int tel, int countNum, String password) {
        this.id=id;
        this.nom = nom;
        this.email = email;
        this.adresse = adresse;
        this.codePostale = codePostale;
        this.ville = ville;
        this.region = region;
        this.tel = tel;
        this.countNum = countNum;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(int codePostale) {
        this.codePostale = codePostale;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getCountNum() {
        return countNum;
    }

    public void setCountNum(int countNum) {
        this.countNum = countNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
