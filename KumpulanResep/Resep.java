package KumpulanResep;

/**
 *
 * @author Nanda Tiara Sabina Hidayatulloh
 */

// class induk
public abstract class Resep {
    private String nama;
    private String deskripsi;
    
    public Resep(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }
    
    // method getter (enkapsulasi)
    public String getNama() {
        return nama;
    }
    
    public String getDeskripsi() {
        return deskripsi;
    }
    
    // method setter (enkapsulasi)
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    public abstract void isiResep();
}