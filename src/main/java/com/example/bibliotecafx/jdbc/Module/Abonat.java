package com.example.bibliotecafx.jdbc.Module;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name = "Abonati")
public class Abonat {
//    @Id
//    @Column(name = "codAbonat")
    private Integer codAbonat;

//    @Column(name = "nume")
    private String nume;

//    @Column(name = "prenume")
    private String prenume;

//    @Column(name = "CNP")
    private Integer CNP;

//    @Column(name = "adresa")
    private String adresa;

//    @Column(name = "telefon")
    private Integer telefon;

    // Constructor implicit
    public Abonat() {
    }

    // Constructor cu parametri
    public Abonat(Integer codAbonat, String nume, String prenume, Integer CNP, String adresa, Integer telefon) {
        this.codAbonat = codAbonat;
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.adresa = adresa;
        this.telefon = telefon;
    }

    // Getteri
    public Integer getCodAbonat() {
        return codAbonat;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getCNP() {
        return CNP;
    }

    public String getAdresa() {
        return adresa;
    }

    public Integer getTelefon() {
        return telefon;
    }

    // Setteri
    public void setCodAbonat(Integer codAbonat) {
        this.codAbonat = codAbonat;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setCNP(Integer CNP) {
        this.CNP = CNP;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }
}
