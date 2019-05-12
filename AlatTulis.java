package pbo10;

import java.util.Scanner;

public class AlatTulis extends Alat {

    Scanner input = new Scanner(System.in);

    public String Fungsi() {
        System.out.print("Masukkan Fungsi :");
        String fgs = input.next();
        return fgs;
    }

    public String Warna() {
        System.out.print("Masukkan Warna :");
        String fgs = input.next();
        return fgs;
    }

    public double Dimensi(double Dimensi, double p, double l) {
        System.out.println("Dimensi P " + p + " & L " + l);
        return Dimensi;

    }
}
