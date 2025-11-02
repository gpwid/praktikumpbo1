/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.pbo9;

import java.util.ArrayList;

/**
 *
 * @author desktop
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private String jenisKelamin;
    private boolean isActive;
    
    public static ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
    
    public Mahasiswa(String nama, String nim, String prodi, String jenisKelamin, boolean isActive) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.jenisKelamin = jenisKelamin;
        this.isActive = isActive;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getNIM() {
        return this.nim;
    }
    
    public String getProdi() {
        return this.prodi;
    }
    
    public String getJenisKelamin() {
        return this.jenisKelamin;
    }
    
    public boolean getIsActive() {
        return this.isActive;
    }
}
