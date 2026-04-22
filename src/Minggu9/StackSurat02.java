package Minggu9;

public class StackSurat02 {
    Surat02[] stack;
    int size;
    int top;
 
    public StackSurat02(int size) {
        this.size = size;
        stack = new Surat02[size];
        top = -1;
    }
 
    public boolean isFull() {
        return top == size - 1;
    }
 
    public boolean isEmpty() {
        return top == -1;
    }
 
    // Push: terima surat baru
    public void push(Surat02 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }
 
    // Pop: proses/verifikasi surat teratas
    public Surat02 pop() {
        if (!isEmpty()) {
            Surat02 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }
 
    // Peek: lihat surat teratas tanpa mengeluarkan
    public Surat02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
    }
 
    // Cari surat berdasarkan nama mahasiswa
    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}
