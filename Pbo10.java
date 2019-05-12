package pbo10;

import java.util.Scanner;

public class Pbo10 {

    static Scanner in = new Scanner(System.in);
    static double harga,Dimensi;
    static String Alat, merk, Warna, Wujud,Fungsi,Jenis,Manfaat;
    static AlatMandi mandi = new AlatMandi();
    static AlatTulis tulis = new AlatTulis();
    static AlatKesehatan sehat = new AlatKesehatan();
    static Alat ya = new Alat();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih Alat ");
        System.out.println("1. Alat Mandi");
        System.out.println("2. Alat Tulis");
        System.out.println("3. Alat Kesehatan");
        System.out.print("Pilihan Anda :");
        int pilih = input.nextInt();
        if (pilih == 1) {
            System.out.println("Alat Mandi");
            System.out.print("Masukan Nama : ");
            String nama = in.next();
            merk = mandi.merk();
            harga = mandi.harga();
            Warna = mandi.Warna();
            Wujud = mandi.Wujub();
            System.out.println("==================");
            System.out.println("Nama Alat :"+ nama);
            System.out.println("Harga Alat :"+ harga);
            System.out.println("Merk Alat : "+ merk);
            System.out.println("Warna Alat :"+ Warna);
            System.out.println("Wujud Alat :"+ Wujud);
            
        } 
        else if (pilih == 2) {
            System.out.println("Alat Tulis");
            System.out.print("Masukan Nama : ");
            String nama = in.next();
            merk = tulis.merk();
            harga = tulis.harga();
            Warna = tulis.Warna();
            Fungsi = tulis.Fungsi();
            System.out.println("Masukan Dimensi P&L :");
            System.out.print("Masukan P :");
            int p = input.nextInt();
            System.out.print("Masukan L");
            int l = input.nextInt();
            System.out.println("==================");
            System.out.println("Nama Alat :"+ nama);
            System.out.println("Harga Alat :"+ harga);
            System.out.println("Merk Alat : "+ merk);
            System.out.println("Warna Alat :"+ Warna);
            System.out.println("Fungsi Alat :"+ Fungsi);
            tulis.Dimensi(Dimensi, p, l);
        }
        else if(pilih==3){
            System.out.println("Alat Kesehatan");
            System.out.print("Masukan Nama : ");
            String nama = in.next();
            merk = sehat.merk();
            harga = sehat.harga();
            Jenis = sehat.Jenis();
            Manfaat = sehat.Manfaat();
            System.out.println("==================");
            System.out.println("Nama Alat :"+ nama);
            System.out.println("Harga Alat :"+ harga);
            System.out.println("Merk Alat : "+ merk);
            System.out.println("Warna Alat :"+ Jenis);
            System.out.println("Fungsi Alat :"+ Manfaat);
        }
    }

}
