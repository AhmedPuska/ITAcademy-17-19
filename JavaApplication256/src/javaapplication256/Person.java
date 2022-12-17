package javaapplication256;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    
    public int id;
    public String ime;
    public Person(int id, String ime)
        {
            this.id = id;
            this.ime = ime;
        }

//    public String ime;
    public String prezime;
    public String mjestoRodjenja;
    public LocalDate datumRodjenja;

    public Person(String ime, String prezime, String mjestoRodjenja, LocalDate datumRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.mjestoRodjenja = mjestoRodjenja;
        this.datumRodjenja = datumRodjenja;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd.MMM yyyy.");
        return ("Ime: " + ime + " / " + "Prezime: " + prezime + " / "
                + "Datum rodjenja: " + datumRodjenja.format(dtf2) + " / "
                + "Mjesto rodjenja: " + mjestoRodjenja);
    }

}
