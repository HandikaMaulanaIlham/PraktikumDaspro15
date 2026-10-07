import java.sql.JDBCType;
import java.util.Scanner;

public class StudiKasus215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Nama, jenisLomba;
        byte juara, uploadDoc, statusPKM;

        System.out.print("Nama Mahasiswa : ");
        Nama = sc.nextLine();
        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisLomba = sc.nextLine();

        if (jenisLomba.equalsIgnoreCase("BELMAWA") || 
            jenisLomba.equalsIgnoreCase("BAKORMA") || 
            jenisLomba.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Juara Berapa (1/2/3/0(Tidak Juara)) : ");
            juara = sc.nextByte();
            System.out.print("Jumlah Dokumen (0-4) : ");
            uploadDoc = sc.nextByte();
            if (juara == 0 && uploadDoc == 4 ) {
                System.out.println("Data lengkap tetapi tidak juara. Dana penghargaan tidak diberikan");
            } else if (juara <= 3 && uploadDoc < 4) {
                System.out.println("Data tidak lengkap. Dana penghargaan tidak diberikan");
            } else if ( juara <= 3 && uploadDoc == 4){
                System.out.println("Data lengkap. Dana penghargaan diberikan");
            } else{
                System.out.println("Inputan tidak valid");
            } 
        } else if (jenisLomba.equalsIgnoreCase("PKM")) {
            System.out.print("Status PKM (1(lolos)/0(Tidak lolos)) : ");
            statusPKM = sc.nextByte();
            System.out.print("Jumlah Dokumen (0-4) : ");
            uploadDoc = sc.nextByte();
            if (statusPKM == 1 && uploadDoc == 4) {
                System.out.println("Data Lengkap. Dana penghargaan diberikan");
            }else if (statusPKM == 0 && uploadDoc == 4) {
                System.out.println("Tidak lolos pendanaan PKM. Dana tidak diberikan");
            } else if (statusPKM == 0 && uploadDoc < 4 ) {
                System.out.println("Tidak lolos pendanaan PKM. Dana tidak diberikan");
            } else {
                System.out.println("Inputan tidak valid");
            }
        } else {
            System.out.println("Dana Penghargaan tidak diberikan");
        }
    }
}
