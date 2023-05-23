package KumpulanResep;

/**
 *
 * @author Nanda Tiara Sabina Hidayatulloh
 */

// class anak dari induknya yaitu class Resep
public class SeblakCoet extends Resep {
    public SeblakCoet(String nama, String deskripsi) {
        super(nama, deskripsi);
    }
    
    @Override // penerapan polimorfisme dinamis method overriding
    public void isiResep() {
        System.out.println("1. Siapkan kencur, bawang putih, cabai dan kerupuk seblak sesuai selera.");
        System.out.println("2. Haluskan bumbu yang sudah disiapkan dan tambahkan sedikit penyedap rasa.");
        System.out.println("3. Rebus kerupuk hingga matang.");
        System.out.println("4. Panaskan minyak dan masukkan ke dalam bumbu yang telah dihaluskan.");
        System.out.println("5. Masukkan kerupuk ke dalam bumbu dan aduk secara merata.");
        System.out.println("6. Seblak siap dihidangkan.");
    }
}