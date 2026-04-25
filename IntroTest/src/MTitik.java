/*
 * File     : MTitik.java
 * Deskripsi: Main class Titik
 * Pembuat  : Mohammad Najib Fitrianto
 */

public class MTitik {
    public static void main(String[] args) {
        // membuat objek titik
        Titik t1 = new Titik(2, 3);

        // menampilkan titik awal
        System.out.print("Titik awal: ");
        t1.tampilkanTitik();

        // mengubah nilai titik
        t1.setAbsis(5);
        t1.setOrdinat(7);

        // menampilkan titik setelah diubah
        System.out.print("Titik setelah diubah: ");
        t1.tampilkanTitik();
    }
}
