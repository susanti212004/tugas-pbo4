class OperasiMatematika {
    int hitung(int a, int b) {
        return a + b;
    }

    // Overloading
    double hitung(double a, double b) {
        return a + b;
    }
}

class OperasiPengurangan extends OperasiMatematika {
    
    // Overriding
    @Override
    int hitung(int a, int b) {
        return a - b;
    }
    
    // Overloading dan Overriding
    @Override
    double hitung(double a, double b) {
        return a - b;
    }
}

