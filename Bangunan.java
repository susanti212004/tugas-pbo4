class Bangunan {
    // Overloading method untuk menghitung luas persegi
    double hitungLuas(double sisi) {
        return sisi * sisi;
    }

    // Overloading method untuk menghitung luas persegi panjang
    double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }
    
    // Overloading method untuk menghitung luas segitiga
    double hitungLuas(double alas, double tinggi, char tipe) {
        return 0.5 * alas * tinggi;
    }
}

