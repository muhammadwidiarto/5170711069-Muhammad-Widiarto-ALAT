package pbo10;
import java.util.Scanner ;

public class AlatMandi extends Alat {
    Scanner i = new Scanner(System.in);
    public String Wujub(){
        System.out.print("Masukkan Wujud :");
        String wjd = i.next();
        return wjd ;
    }
    public String Warna(){
        System.out.print("Masukkan Warna :");
        String wrn = i.next();
        return wrn ;
    }
}
