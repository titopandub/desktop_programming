class Encapsulation {
    private String nama;
    private int nim;
    public String getNama() {
        return this.nama;
    }
    public void ModifNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return this.nim;
    }
    public void ModifNim(int nim) {
        this.nim = nim;
    }
}

public class Main {
    public static void main(String[] args) {
        Encapsulation objek = new Encapsulation();
        objek.ModifNim(1420123);
        objek.ModifNama("Mahasiswa");
        System.out.println("Nim : " + objek.getNim());
        System.out.println("Nama : " + objek.getNama());
    }
}
