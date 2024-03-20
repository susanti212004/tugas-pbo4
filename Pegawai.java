public class Pegawai {
    String nama = "Nama Pegawai";
    
    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
    }
}

class Manajer extends Pegawai {
    String nama = "Nama Manajer";
    
    @Override
    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
    }
}


 
    

