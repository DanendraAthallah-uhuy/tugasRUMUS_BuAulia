import java.util.Scanner;

public class jajargenjang {
    public static void main(String[] args) {

        System.out.println("MENGHITUNG LUAS JAJARGENJANG");
        System.out.println("============================");
        
        int alas,tinggi_jajargenjang,hasil;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan alas jajargenjang");
        alas = input.nextInt();
        System.out.println("Masukan tinggi satuan persegi jajargenjang");
        tinggi_jajargenjang = input.nextInt();
        hasil = alas*tinggi_jajargenjang;
        System.out.println("hasil luas jajargenjang: "+hasil);
    }
    
}