package KumpulanResep;

/**
 *
 * @author Nanda Tiara Sabina Hidayatulloh
 */

// class anak dari induknya yaitu class Resep
public class Mojito extends Resep {
    public Mojito(String nama, String deskripsi) {
        super(nama, deskripsi);
    }

    @Override // penerapan polimorfisme dinamis method overriding
    public void isiResep() {
        System.out.println("1. Ambil gelas besar.");
        System.out.println("2. Masukkan daun mint, irisan lemon, dan gula ke dalam gelas.");
        System.out.println("3. Tumbuk bahan-bahan tersebut dengan menggunakan alat penghancur.");
        System.out.println("4. Tambahkan es batu dan tuangkan air soda secukupnya.");
        System.out.println("5. Aduk rata dan tambahkan garnish sesuai selera.");
        System.out.println("6. Mojito siap disajikan.");
    }
}