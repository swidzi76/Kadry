package kadryTools;

import java.time.LocalDate;

public class Person {
    String nazwisko;
    String imiona;
    String imieOjca;
    String imieMatki;
    String nazwiskoPanienskieMatki;
    String nazwiskoPanienskie;
    LocalDate dataUrodzenia;
    String miejsceUrodzenia;

    String narodowosc;
    String obywatelstwo;
    String plec;
    String stanCywilny;

    String wyksztalcenie;
    String tytuł;

    String nrDowoduOsobistego;
    LocalDate dataWydaniaDowodu;
    String ktoWydalDowod;
    String pesel;
    Address adresZamieszkania;

    public Person(String nazwisko, String imiona) {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImiona() {
        return imiona;
    }

    public void setImiona(String imiona) {
        this.imiona = imiona;
    }

    public String getImieOjca() {
        return imieOjca;
    }

    public void setImieOjca(String imieOjca) {
        this.imieOjca = imieOjca;
    }

    public String getImieMatki() {
        return imieMatki;
    }

    public void setImieMatki(String imieMatki) {
        this.imieMatki = imieMatki;
    }

    public String getNazwiskoPanienskieMatki() {
        return nazwiskoPanienskieMatki;
    }

    public void setNazwiskoPanienskieMatki(String nazwiskoPanienskieMatki) {
        this.nazwiskoPanienskieMatki = nazwiskoPanienskieMatki;
    }

    public String getNazwiskoPanienskie() {
        return nazwiskoPanienskie;
    }

    public void setNazwiskoPanienskie(String nazwiskoPanienskie) {
        this.nazwiskoPanienskie = nazwiskoPanienskie;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getMiejsceUrodzenia() {
        return miejsceUrodzenia;
    }

    public void setMiejsceUrodzenia(String miejsceUrodzenia) {
        this.miejsceUrodzenia = miejsceUrodzenia;
    }

    public String getNarodowosc() {
        return narodowosc;
    }

    public void setNarodowosc(String narodowosc) {
        this.narodowosc = narodowosc;
    }

    public String getObywatelstwo() {
        return obywatelstwo;
    }

    public void setObywatelstwo(String obywatelstwo) {
        this.obywatelstwo = obywatelstwo;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public String getStanCywilny() {
        return stanCywilny;
    }

    public void setStanCywilny(String stanCywilny) {
        this.stanCywilny = stanCywilny;
    }

    public String getWyksztalcenie() {
        return wyksztalcenie;
    }

    public void setWyksztalcenie(String wyksztalcenie) {
        this.wyksztalcenie = wyksztalcenie;
    }

    public String getTytuł() {
        return tytuł;
    }

    public void setTytuł(String tytuł) {
        this.tytuł = tytuł;
    }

    public String getNrDowoduOsobistego() {
        return nrDowoduOsobistego;
    }

    public void setNrDowoduOsobistego(String nrDowoduOsobistego) {
        this.nrDowoduOsobistego = nrDowoduOsobistego;
    }

    public LocalDate getDataWydaniaDowodu() {
        return dataWydaniaDowodu;
    }

    public void setDataWydaniaDowodu(LocalDate dataWydaniaDowodu) {
        this.dataWydaniaDowodu = dataWydaniaDowodu;
    }

    public String getKtoWydalDowod() {
        return ktoWydalDowod;
    }

    public void setKtoWydalDowod(String ktoWydalDowod) {
        this.ktoWydalDowod = ktoWydalDowod;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Address getAdresZamieszkania() {
        return adresZamieszkania;
    }

    public void setAdresZamieszkania(Address adresZamieszkania) {
        this.adresZamieszkania = adresZamieszkania;
    }
}
