package Minggu9;

import java.util.Scanner;

public class SuratDemo02 {
    public static void main(String[] args) {
        StackSurat02 stack = new StackSurat02(10);
        Scanner scan = new Scanner(System.in);
        int pilih;
 
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
 
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S=Sakit / I=Izin): ");
                    char jenisIzin = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
 
                    Surat02 surat = new Surat02(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.printf("Surat izin dari %s berhasil diterima.\n", nama);
                    break;
 
                case 2:
                    Surat02 diproses = stack.pop();
                    if (diproses != null) {
                        String jenis = (diproses.jenisIzin == 'S') ? "Sakit" : "Izin Keperluan Lain";
                        System.out.println("=== Memproses Surat Izin ===");
                        System.out.println("ID Surat       : " + diproses.idSurat);
                        System.out.println("Nama Mahasiswa : " + diproses.namaMahasiswa);
                        System.out.println("Kelas          : " + diproses.kelas);
                        System.out.println("Jenis Izin     : " + jenis);
                        System.out.println("Durasi         : " + diproses.durasi + " hari");
                        System.out.println("Status         : Surat berhasil diverifikasi.");
                    }
                    break;
 
                case 3:
                    Surat02 terakhir = stack.peek();
                    if (terakhir != null) {
                        String jenis = (terakhir.jenisIzin == 'S') ? "Sakit" : "Izin Keperluan Lain";
                        System.out.println("=== Surat Izin Terakhir ===");
                        System.out.println("ID Surat       : " + terakhir.idSurat);
                        System.out.println("Nama Mahasiswa : " + terakhir.namaMahasiswa);
                        System.out.println("Kelas          : " + terakhir.kelas);
                        System.out.println("Jenis Izin     : " + jenis);
                        System.out.println("Durasi         : " + terakhir.durasi + " hari");
                    }
                    break;
 
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = scan.nextLine();
                    boolean ditemukan = stack.cariSurat(cari);
                    if (ditemukan) {
                        System.out.println("Surat izin atas nama \"" + cari + "\" DITEMUKAN di dalam stack.");
                    } else {
                        System.out.println("Surat izin atas nama \"" + cari + "\" TIDAK DITEMUKAN.");
                    }
                    break;
 
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
 
        scan.close();
    }
}
