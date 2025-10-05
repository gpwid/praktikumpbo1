/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.praktikumpbo6;

/**
 *
 * @author kitsunne
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("## Detail Jurusan Mahasiswa ##");

        Jurusan jurusanTI = new Jurusan();

        jurusanTI.setKodeJurusan(46);
        jurusanTI.setNamaJurusan("D3 Manajemen");

        System.out.println("Nama Jurusan: " + jurusanTI.getNamaJurusan());
        System.out.println("Kode Jurusan: " + jurusanTI.getKodeJurusan());

        System.out.println("Fakultas    : " + Fakultas.getNamaFakultas());
        System.out.println("==============================\n");

        Fakultas.infoFakultas();
    }
}