import java.util.Scanner;

public class StudiKasus115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang, hargaPerCup = 18000;

        System.out.print("Masukkan Jumlah Cup : ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan Uang Bayar : ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga : " + totalHarga );
        System.out.println("Diskon : " + diskon );
        System.out.println("Total Bayar : " + totalBayar );

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian anda Rp" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang Tidak Cukup, kurang Rp" + kurang);
        }
    }
}
