/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.praktikumpbo5selvianaananda;

/**
 *
 * @author kitsunne
 */
public class Sepatu {
    // atribut
    public String merk;
    public int ukuran;
    public int tahunProduksi;
    
    // constructor default
    public Sepatu() {
        this.merk = "unknown";
        this.ukuran = 0;
        this.tahunProduksi = 0;
    }
    
    // constructor dengan 3 parameter
    public Sepatu(String merk, int ukuran, int tahunProduksi) {
        this.merk = merk;
        this.ukuran = ukuran;
        this.tahunProduksi = tahunProduksi;
    }
    
    // method 1 (tampilkan info basic)
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Tahun Produksi: " + (tahunProduksi == 0 ? "Tidak diketahui" : tahunProduksi));
        System.out.println("-------------------");
    }
    
    // method 2 (tampilkan info dengan kategori berdasarkan ukuran)
    public void tampilkanInfo(boolean showKategori) {
        tampilkanInfo();
        if (showKategori) {
            String kategori;
            if (ukuran <= 36) {
                kategori = "Ukuran Kecil";
            } else if (ukuran <= 42) {
                kategori = "Ukuran Sedang";
            } else {
                kategori = "Ukuran Besar";
            }
            System.out.println("Kategori: " + kategori);
            System.out.println("-------------------");
        }
    }
}

