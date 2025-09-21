/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.praktikumpbo5selvianaananda;

/**
 *
 * @author kitsunne
 */
public class MainSepatu {
    public static void main(String[] args) {
        System.out.println("=== DATA SEPATU ===");
        
        Sepatu sepatu1 = new Sepatu(); // object 1 (default constructor)
        Sepatu sepatu2 = new Sepatu("Onitsuka Tiger", 39, 2020);
        Sepatu sepatu3 = new Sepatu("Asics", 38, 2023);
        
        System.out.println("1. Info Basic:");
        sepatu1.tampilkanInfo(); // method tanpa parameter
        
        System.out.println("2. Info dengan parameter:");
        sepatu2.tampilkanInfo(false); // method dengan parameter boolean false
        
        System.out.println("3. Info dengan Kategori:");
        sepatu3.tampilkanInfo(true); // method dengan parameter boolean true
    }
}


