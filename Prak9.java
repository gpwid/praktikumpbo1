/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kelompok2.prak9;

/**
 *
 * @author user
 */
public class Prak9 {

    public static void main(String[] args) {
        // Buat objek frame utama
        MainJFrame frame = new MainJFrame();
        
        // Set panel awal yang ditampilkan
        frame.changeMainPanel(new TambahDataPanel());
        
        // Tampilkan frame 
        frame.setVisible(true);
    }
}

