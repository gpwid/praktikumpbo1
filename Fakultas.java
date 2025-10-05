/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.praktikumpbo6;

/**
 *
 * @author kitsunne
 */
public class Fakultas {
    private static String namaFakultas = "Fakultas Ekonomi dann Bisnis";

    private static String namaDekan = "Dr. Hj. Alvi Furwanti Alwie, SE., MM.";

    public static String getNamaFakultas() {
        return namaFakultas;
    }

    public static String getNamaDekan() {
        return namaDekan;
    }

    public static void infoFakultas() {
        System.out.println("--- Informasi Fakultas ---");
        System.out.println("Nama Fakultas: " + namaFakultas);
        System.out.println("Nama Dekan   : " + namaDekan);
        System.out.println("-------------------------");
    }
}