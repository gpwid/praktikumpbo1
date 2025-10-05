package com.kelompok2.praktikumpbo6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kitsunne
 */
public class Jurusan {
    private int kodeJurusan;
    private String namaJurusan;

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }
    public void setKodeJurusan(int kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }

    public int getKodeJurusan() {
        return kodeJurusan;
    }
    public String getNamaJurusan() {
        return namaJurusan;
    }
}
