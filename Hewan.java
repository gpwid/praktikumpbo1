/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.praktikumpbo5selvianaananda;

/**
 *
 * @author kitsunne
 */
abstract class Hewan {
    String nama;
    public Hewan (String nama) {
        this.nama = nama;
    }

    //method abstract (wajib diimplementasikan oleh subclass)
    abstract void suara();
    //method biasa
    void info () {
        System.out.println("Nama hewan: " +nama);
    }
}
