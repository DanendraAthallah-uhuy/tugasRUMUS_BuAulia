import java.util.Scanner;

public class diskon {

    public static void main(String[] args) {
        
        System.out.println("Selamat Datang Di Superindo");
        System.out.println("___________________________");

        String namabarang;
        double hargabarang,jumlahbarang,diskon;
        Scanner input = new Scanner(System.in);
        System.out.println("Nama Barang");
        namabarang = input.nextLine();
        double totalharga;
        System.out.println("Masukan Harga Barang");
        hargabarang = input.nextDouble();
        System.out.println("Masukan Jumlah Barang");
        jumlahbarang = input.nextDouble();
        System.out.println("Diskon yang didapat");
        diskon = input.nextDouble();
        System.out.println("====================================");

        double TotalHarga;
        TotalHarga = (hargabarang*jumlahbarang);
        diskon = (diskon/100)*TotalHarga;
        double HargaDiskon = TotalHarga-diskon;
        System.out.println("Total semua harga: Rp. "+TotalHarga);
        System.out.println("Potongan/Chasback Diskon: "+diskon);
        System.out.println("____________________________________");
        System.out.println("Harga Diskon: Rp. "+HargaDiskon);
    }
}
