package KumpulanResep;

/**
 *
 * @author Nanda Tiara Sabina Hidayatulloh
 */

// class anak dari induknya yaitu class Resep
public class Milkshake extends Resep {
    public Milkshake(String nama, String deskripsi) {
        super(nama, deskripsi);
    }

    @Override // penerapan polimorfisme dinamis method overriding
    public void isiResep() {
        System.out.println("1. Siapkan es krim favorit.");
        System.out.println("2. Masukkan es krim ke dalam blender.");
        System.out.println("3. Tambahkan susu cair dan pilihan topping.");
        System.out.println("4. Blender hingga semua bahan tercampur dengan baik.");
        System.out.println("5. Tuang milkshake ke dalam gelas saji.");
        System.out.println("6. Hidangkan dengan sedotan dan strawberi di atasnya atau hiasan lainnya.");
    }
}