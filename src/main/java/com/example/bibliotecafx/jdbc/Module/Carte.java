package com.example.bibliotecafx.jdbc.Module;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name = "Carti")
public class Carte {
//    @Id
//    @Column(name = "codCarte")
    private Integer codCarte;

//    @Column(name = "codExemplar")
    private Integer codExemplar;

//    @Column(name = "titlu")
    private String titlu;

//    @Column(name = "autor")
    private String autor;


//    @Enumerated(EnumType.STRING)
//    @Column(name = "status")
    private StatusCarte status;

    // Constructor implicit
    public Carte() {
    }

    // Constructor cu parametri
    public Carte(Integer codCarte, Integer codExemplar, String titlu, String autor, StatusCarte status) {
        this.codCarte = codCarte;
        this.codExemplar = codExemplar;
        this.titlu = titlu;
        this.autor = autor;
        this.status = status;
    }

    // Getteri
    public Integer getCodCarte() {
        return codCarte;
    }

    public Integer getCodExemplar() {
        return codExemplar;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public StatusCarte getStatus() {
        return status;
    }

    // Setteri
    public void setCodCarte(Integer codCarte) {
        this.codCarte = codCarte;
    }

    public void setCodExemplar(Integer codExemplar) {
        this.codExemplar = codExemplar;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setStatus(StatusCarte status) {
        this.status = status;
    }
}
