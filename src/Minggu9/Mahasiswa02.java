package Minggu9;

public class Mahasiswa02 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa02(String nama, String nim, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
