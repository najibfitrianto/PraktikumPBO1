/*
 * File     : Titik.java
 * Deskripsi: Class Titik
 * Pembuat  : Mohammad Najib Fitrianto
 */

public class Titik {
    // atribut
    double absis;
    double ordinat;

    // konstruktor
    Titik(double a, double o) {
        absis = a;
        ordinat = o;
    }

    // method untuk menampilkan titik
    void tampilkanTitik() {
        System.out.println("(" + absis + ", " + ordinat + ")");
    }

    // method untuk mengubah absis
    void setAbsis(double a) {
        absis = a;
    }

    // method untuk mengubah ordinat
    void setOrdinat(double o) {
        ordinat = o;
    }

    // method untuk mengambil absis
    double getAbsis() {
        return absis;
    }

    // method untuk mengambil ordinat
    double getOrdinat() {
        return ordinat;
    }
}
