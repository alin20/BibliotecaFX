package com.example.bibliotecafx.jdbc.Module;

public class Bibliotecar  {
    //    @Id
//    @Column(name = "codBibliotecar")
    private Integer codBibliotecar;

    //    @Column(name = "nume")
    private String nume;

    //    @Column(name = "prenume")
    private String prenume;

    //    @Column(name = "parola")
    private String parola;

    // Constructor implicit
    public Bibliotecar() {
    }

    // Constructor cu parametri
    public Bibliotecar(Integer codBibliotecar, String nume, String prenume,  String parola) {
        this.codBibliotecar = codBibliotecar;
        this.nume = nume;
        this.prenume = prenume;
        this.parola = parola;
    }

    // Getteri
    public Integer getCodBibliotecar() {
        return codBibliotecar;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }


    public String getAdresa() {
        return parola;
    }


    // Setteri
    public void setCodBibliotecar(Integer codBibliotecar) {
        this.codBibliotecar = codBibliotecar;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setAdresa(String adresa) {
        this.parola = adresa;
    }

}
