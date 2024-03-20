//nama: susanti
public class Main {
    public static void main(String[] args) {
        // Contoh 1: Overloading
        Bangunan bangunan = new Bangunan();
        System.out.println("Luas Persegi: " + bangunan.hitungLuas(5.0));
        System.out.println("Luas Persegi Panjang: " + bangunan.hitungLuas(5.0, 10.0));
        System.out.println("Luas Segitiga: " + bangunan.hitungLuas(5.0, 10.0, 't'));
        
        System.out.println();
        
        // Contoh 2: Overriding
        Pegawai pegawai = new Pegawai();
        pegawai.tampilkanInfo();
        
        Pegawai manajer = new Manajer(); // Polimorfisme
        manajer.tampilkanInfo();
        
        System.out.println();
        
        // Contoh 3: Gabungan Overloading dan Overriding
        OperasiMatematika op = new OperasiMatematika();
        System.out.println("Penjumlahan: " + op.hitung(5, 3)); // Memanggil method dari OperasiMatematika
        
        OperasiMatematika opPengurangan = new OperasiPengurangan();
        System.out.println("Pengurangan: " + opPengurangan.hitung(5, 3)); // Memanggil method yang di-override di OperasiPengurangan
    }
}
