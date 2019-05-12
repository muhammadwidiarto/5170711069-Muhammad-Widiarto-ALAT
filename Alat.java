package pbo10;

import java.util.Scanner;

public class Alat {

    Scanner i = new Scanner(System.in);

    public double harga() {
        System.out.print("Harga :");
        double harga = i.nextDouble();
        return harga;
    }
    public String merk() {
        System.out.print("Masukkan Merk :");
        String merk = i.next();
        return merk;
    }
}
