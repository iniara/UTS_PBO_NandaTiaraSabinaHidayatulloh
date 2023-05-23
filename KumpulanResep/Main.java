package KumpulanResep;

/**
 *
 * @author Nanda Tiara Sabina Hidayatulloh
 */

import java.util.Scanner;
import KumpulanResep.Resep;
import KumpulanResep.Bubur;
import KumpulanResep.NasiGoreng;
import KumpulanResep.SeblakCoet;
import KumpulanResep.JusBuah;
import KumpulanResep.Mojito;
import KumpulanResep.Milkshake;

public class Main {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int pilihResep;
        
        do {
            System.out.println("\n\t     COOKING BUNDA");
            System.out.println("Selamat datang di aplikasi kumpulan resep!\n");
            System.out.println("Mau masak apa hari ini?");
            System.out.println("1. Bubur Ayam");
            System.out.println("2. Nasi Goreng");
            System.out.println("3. Seblak Coet Viral");
            System.out.println("4. Jus Buah");
            System.out.println("5. Mojito");
            System.out.println("6. Milkshake");
            System.out.println("0. Keluar");
            System.out.print("Pilihanmu: ");
            pilihResep = input.nextInt();
            System.out.println("");
            
            switch (pilihResep) {
                case 1:
                    Resep bubur = new Bubur("Bubur", "Bubur Ayam");
                    bubur.setNama("RESEP BUBUR AYAM"); // method setter
                    System.out.println(bubur.getNama()); // method getter
                    bubur.isiResep();
                    bubur.setDeskripsi("Itulah resep bubur ayam, selamat mencoba!");
                    System.out.println(bubur.getDeskripsi());
                    break;
                
                case 2:
                    Resep nasiGoreng = new NasiGoreng("Nasi Goreng", "Nasi Goreng Spesial");
                    nasiGoreng.setNama("RESEP NASI GORENG");
                    System.out.println(nasiGoreng.getNama());
                    nasiGoreng.isiResep();
                    nasiGoreng.setDeskripsi("Itulah resep nasi goreng, selamat mencoba!");
                    System.out.println(nasiGoreng.getDeskripsi());
                    break;
                    
                case 3:
                    Resep seblakCoet = new SeblakCoet("Seblak Coet", "Seblak Coet Viral");
                    seblakCoet.setNama("RESEP SEBLAK COET VIRAL");
                    System.out.println(seblakCoet.getNama());
                    seblakCoet.isiResep();
                    seblakCoet.setDeskripsi("Itulah resep seblak coet, selamat mencoba!");
                    System.out.println(seblakCoet.getDeskripsi());
                    break;
                    
                case 4:
                    Resep jusBuah = new JusBuah("Jus Buah", "Jus Buah Segar");
                    jusBuah.setNama("RESEP JUS BUAH");
                    System.out.println(jusBuah.getNama());
                    jusBuah.isiResep();
                    jusBuah.setDeskripsi("Itulah resep jus buah, selamat mencoba!");
                    System.out.println(jusBuah.getDeskripsi());
                    break;
                    
                case 5:
                    Resep mojito = new Mojito("Mojito", "Mojito Segar");
                    mojito.setNama("RESEP MOJITO");
                    System.out.println(mojito.getNama());
                    mojito.isiResep();
                    mojito.setDeskripsi("Itulah resep mojito, selamat mencoba!");
                    System.out.println(mojito.getDeskripsi());
                    break;
                    
                case 6:
                    Resep milkshake = new Milkshake("Milkshake", "Milkshake Segar");
                    milkshake.setNama("RESEP MILKSHAKE");
                    System.out.println(milkshake.getNama()); 
                    milkshake.isiResep();
                    milkshake.setDeskripsi("Itulah resep milkshake, selamat mencoba!");
                    System.out.println(milkshake.getDeskripsi());
                    break;
                    
                case 0:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini! Selamat memasak!");
                    break;
                    
                default:
                    System.out.println("Mohon maaf pilihanmu tidak terdaftar, silakan coba lagi.");
            }
        }
        while (pilihResep != 0);
    }   
}