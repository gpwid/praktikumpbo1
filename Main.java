/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.praktikumpbo5selvianaananda;

/**
 *
 * @author kitsunne
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil("Scuderia Ferrari 25");

        System.out.println(mobil2.merk);

        Kalkulator calc = new Kalkulator();
        System.out.println(calc.tambah(5, 3));
        System.out.println(calc.tambah(5.5, 3.2));
        System.out.println(calc.tambah("Hello ", "World"));
    }
}
