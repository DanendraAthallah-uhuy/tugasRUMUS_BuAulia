import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {
        
        double jamkerjakaryawan,tarifperjam;
        Scanner input = new Scanner(System.in);
        double Bruto;
        System.out.println("Jumlah Jam Kerja Karyawan");
        jamkerjakaryawan = input.nextDouble();
        System.out.println("Harga tarif perjam");
        tarifperjam = input.nextDouble();

        System.out.println("==============================");

        double bruto,pajak;
        bruto = (jamkerjakaryawan*tarifperjam);
        pajak = bruto*0.10;
        double gajiBersih = bruto-pajak;

        System.out.println("Bruto: Rp. "+bruto);
        System.out.println("Potongan Pajak (10%): Rp. "+pajak);
        System.out.println("====================================");
        System.out.println("Gaji bersih: Rp. "+gajiBersih);

    
    }
}
