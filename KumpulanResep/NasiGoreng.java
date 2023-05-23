package KumpulanResep;

/**
 *
 * @author Nanda Tiara Sabina Hidayatulloh
 */

// class anak dari induknya yaitu class Resep
public class NasiGoreng extends Resep {
    public NasiGoreng(String nama, String deskripsi) {
        super(nama, deskripsi);
    }
    
    @Override // penerapan polimorfisme dinamis method overriding
    public void isiResep() {
        System.out.println("1. Panaskan minyak di wajan.");
        System.out.println("2. Tumis bawang putih dan bawang merah hingga harum.");
        System.out.println("3. Masukkan nasi, ayam, sayuran, dan bumbu-bumbu.");
        System.out.println("4. Aduk rata dan masak hingga matang.");
        System.out.println("5. Sajikan nasi goreng dengan telur mata sapi di atasnya.");
    }
}