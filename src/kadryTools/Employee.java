package kadryTools;

import java.time.LocalDate;

public class Employee extends Person {
    static int nr = 0;
    int nrEwidencyjny;
    String nrAkt;
    String kodUmowyOprace;
    LocalDate tetminUplywuumowy;
    String sposobPrzyjecia;
    int lataPracy;
    String zawodWykonywany;
    String nrZakladu;
    String nazwaDzialu;
    String etat;
    String grupaPracownicza;

    public Employee(String nazwisko, String imiona) {
        super(nazwisko, imiona);
        nrEwidencyjny = nr++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nrEwidencyjny=" + nrEwidencyjny +
                ", nrAkt='" + nrAkt + '\'' +
                ", kodUmowyOprace='" + kodUmowyOprace + '\'' +
                ", tetminUplywuumowy=" + tetminUplywuumowy +
                ", sposobPrzyjecia='" + sposobPrzyjecia + '\'' +
                ", lataPracy=" + lataPracy +
                ", zawodWykonywany='" + zawodWykonywany + '\'' +
                ", nrZakladu='" + nrZakladu + '\'' +
                ", nazwaDzialu='" + nazwaDzialu + '\'' +
                ", etat='" + etat + '\'' +
                ", grupaPracownicza='" + grupaPracownicza + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", imiona='" + imiona + '\'' +
                ", imieOjca='" + imieOjca + '\'' +
                ", imieMatki='" + imieMatki + '\'' +
                ", nazwiskoPanienskieMatki='" + nazwiskoPanienskieMatki + '\'' +
                ", nazwiskoPanienskie='" + nazwiskoPanienskie + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                ", miejsceUrodzenia='" + miejsceUrodzenia + '\'' +
                ", narodowosc='" + narodowosc + '\'' +
                ", obywatelstwo='" + obywatelstwo + '\'' +
                ", plec='" + plec + '\'' +
                ", stanCywilny='" + stanCywilny + '\'' +
                ", wyksztalcenie='" + wyksztalcenie + '\'' +
                ", tytuł='" + tytuł + '\'' +
                ", nrDowoduOsobistego='" + nrDowoduOsobistego + '\'' +
                ", dataWydaniaDowodu=" + dataWydaniaDowodu +
                ", ktoWydalDowod='" + ktoWydalDowod + '\'' +
                ", pesel='" + pesel + '\'' +
                ", adresZamieszkania=" + adresZamieszkania +
                '}';
    }

    public int getNrEwidencyjny() {
        return nrEwidencyjny;
    }

    public void setNrEwidencyjny(int nrEwidencyjny) {
        this.nrEwidencyjny = nrEwidencyjny;
    }

    public String getNrAkt() {
        return nrAkt;
    }

    public void setNrAkt(String nrAkt) {
        this.nrAkt = nrAkt;
    }

    public String getKodUmowyOprace() {
        return kodUmowyOprace;
    }

    public void setKodUmowyOprace(String kodUmowyOprace) {
        this.kodUmowyOprace = kodUmowyOprace;
    }

    public LocalDate getTetminUplywuumowy() {
        return tetminUplywuumowy;
    }

    public void setTetminUplywuumowy(LocalDate tetminUplywuumowy) {
        this.tetminUplywuumowy = tetminUplywuumowy;
    }

    public String getSposobPrzyjecia() {
        return sposobPrzyjecia;
    }

    public void setSposobPrzyjecia(String sposobPrzyjecia) {
        this.sposobPrzyjecia = sposobPrzyjecia;
    }

    public int getLataPracy() {
        return lataPracy;
    }

    public void setLataPracy(int lataPracy) {
        this.lataPracy = lataPracy;
    }

    public String getZawodWykonywany() {
        return zawodWykonywany;
    }

    public void setZawodWykonywany(String zawodWykonywany) {
        this.zawodWykonywany = zawodWykonywany;
    }

    public String getNrZakladu() {
        return nrZakladu;
    }

    public void setNrZakladu(String nrZakladu) {
        this.nrZakladu = nrZakladu;
    }

    public String getNazwaDzialu() {
        return nazwaDzialu;
    }

    public void setNazwaDzialu(String nazwaDzialu) {
        this.nazwaDzialu = nazwaDzialu;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getGrupaPracownicza() {
        return grupaPracownicza;
    }

    public void setGrupaPracownicza(String grupaPracownicza) {
        this.grupaPracownicza = grupaPracownicza;
    }
}
