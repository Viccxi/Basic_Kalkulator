class Kalkulator implements Operasi {
    // deklarasi variabel
    private double Bil1, Bil2;

    // constructor default
    Kalkulator() {
    }

    // constructor dengan parameter
    Kalkulator(double Bil1, double Bil2) {
        this.Bil1 = Bil1;
        this.Bil2 = Bil2;
    }

    // getter
    public double getBil1() {
        return Bil1;
    }

    public double getBil2() {
        return Bil2;
    }

    // implementasi method
    @Override
    public void Penjumlahan() {
        System.out.println(Bil1 + Bil2);
    }

    @Override
    public void Pengurangan() {
        System.out.println(Bil1 - Bil2);
    }

    @Override
    public double Perkalian() {
        return Bil1 * Bil2;
    }

    @Override
    public double Pembagian() {
        if (Bil2 != 0) {
            return Bil1 / Bil2;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            return 0; // Return default value if division by zero
        }
    }
}
