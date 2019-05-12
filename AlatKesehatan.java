package pbo10;

import java.util.Scanner ;
public class AlatKesehatan extends Alat{
    Scanner i = new Scanner(System.in);
    public String Jenis(){
        System.out.print("Masukkan Jenis :");
        String jns = i.next();
        return jns ;
    }
    public String Manfaat(){
        System.out.print("Masukkan Manfaat :");
        String manfaat = i.next();
        return manfaat ;
    }
}
