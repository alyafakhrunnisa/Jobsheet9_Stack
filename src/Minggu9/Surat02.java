package Minggu9;

public class Surat02 {
     String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;  // S = sakit, I = izin keperluan lain
    int durasi;
 
    Surat02() {}
 
    Surat02(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}
