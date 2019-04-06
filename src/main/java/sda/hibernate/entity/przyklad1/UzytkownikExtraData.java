package sda.hibernate.entity.przyklad1;

import javax.persistence.*;

@Entity
@Table(name = "uzytkownikextradata")
public class UzytkownikExtraData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column
    private String imie;
    @Column
    private String nazwisko;
    //adres zameldowania
    @Column
    private String ulucaZam;
    @Column
    private String nrDomuZam;
    @Column
    private String nrMieszkaniaZam;
    @Column
    private String kodPocztowyZam;
    @Column
    private String miejscowoscZam;
    //adres korespondencyjny
    @Column
    private String ulucaKor;
    @Column
    private String nrDomuKor;
    @Column
    private String nrMieszkaniaKor;
    @Column
    private String kodPocztowyKor;
    @Column
    private String miejscowoscKor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getUlucaZam() {
        return ulucaZam;
    }

    public void setUlucaZam(String ulucaZam) {
        this.ulucaZam = ulucaZam;
    }

    public String getNrDomuZam() {
        return nrDomuZam;
    }

    public void setNrDomuZam(String nrDomuZam) {
        this.nrDomuZam = nrDomuZam;
    }

    public String getNrMieszkaniaZam() {
        return nrMieszkaniaZam;
    }

    public void setNrMieszkaniaZam(String nrMieszkaniaZam) {
        this.nrMieszkaniaZam = nrMieszkaniaZam;
    }

    public String getKodPocztowyZam() {
        return kodPocztowyZam;
    }

    public void setKodPocztowyZam(String kodPocztowyZam) {
        this.kodPocztowyZam = kodPocztowyZam;
    }

    public String getMiejscowoscZam() {
        return miejscowoscZam;
    }

    public void setMiejscowoscZam(String miejscowoscZam) {
        this.miejscowoscZam = miejscowoscZam;
    }

    public String getUlucaKor() {
        return ulucaKor;
    }

    public void setUlucaKor(String ulucaKor) {
        this.ulucaKor = ulucaKor;
    }

    public String getNrDomuKor() {
        return nrDomuKor;
    }

    public void setNrDomuKor(String nrDomuKor) {
        this.nrDomuKor = nrDomuKor;
    }

    public String getNrMieszkaniaKor() {
        return nrMieszkaniaKor;
    }

    public void setNrMieszkaniaKor(String nrMieszkaniaKor) {
        this.nrMieszkaniaKor = nrMieszkaniaKor;
    }

    public String getKodPocztowyKor() {
        return kodPocztowyKor;
    }

    public void setKodPocztowyKor(String kodPocztowyKor) {
        this.kodPocztowyKor = kodPocztowyKor;
    }

    public String getMiejscowoscKor() {
        return miejscowoscKor;
    }

    public void setMiejscowoscKor(String miejscowoscKor) {
        this.miejscowoscKor = miejscowoscKor;
    }
}
