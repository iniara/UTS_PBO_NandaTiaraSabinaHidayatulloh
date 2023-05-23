package KumpulanResep;

/**
 *
 * @author Nanda Tiara Sabina Hidayatulloh
 */

// class anak dari induknya yaitu class Resep
public class Bubur extends Resep {
    public Bubur(String nama, String deskripsi) {
        super(nama, deskripsi);
    }
    
    @Override // penerapan polimorfisme dinamis method overriding
    public void isiResep() {
        System.out.println("1. Siapkan beras sesuai dengan kebutuhan lalu cuci bersih.");
        System.out.println("2. Masukkan beras ke dalam panci.");
        System.out.println("3. Masak beras dengan air hingga mendidih.");
        System.out.println("4. Tambahkan bumbu penyedap secukupnya.");
        System.out.println("5. Aduk rata dan masak bubur hingga matang");
        System.out.println("6. Hidangkan dengan topping sesuai selera");
    }
}
