package KumpulanResep;

/**
 *
 * @author Nanda Tiara Sabina Hidayatulloh
 */

// class anak dari induknya yaitu class Resep
public class JusBuah extends Resep {
    public JusBuah(String nama, String deskripsi) {
        super(nama, deskripsi);
    }
    
    @Override // penerapan polimorfisme dinamis method overriding
    public void isiResep() {
        System.out.println("1. Pilih buah-buahan segar yang diinginkan.");
        System.out.println("2. Bersihkan dan potong buah-buahan.");
        System.out.println("3. Masukkan buah-buahan ke dalam blender.");
        System.out.println("4. Tambahkan sedikit air atau es batu.");
        System.out.println("5. Blender hingga halus dan jus siap disajikan.");
    }
}